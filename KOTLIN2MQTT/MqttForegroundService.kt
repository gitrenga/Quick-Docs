class MqttForegroundService : Service() {
    private lateinit var client: MqttAndroidClient

    override fun onCreate() {
        super.onCreate()
        createNotificationChannel()
        startForeground(1, createNotification("MQTT Native – Running"))

        client = MqttAndroidClient(this, "tcp://test.mosquitto.org:1883", "native_${Random.nextInt()}")
        client.setCallback(object : MqttCallbackExtended {
            override fun connectComplete(reconnect: Boolean, serverURI: String?) {
                client.subscribe("patient/monitor/poc", 2)
            }
            override fun messageArrived(topic: String?, message: MqttMessage?) {
                val payload = message.toString()
                // Send to UI via LocalBroadcastManager even if app is backgrounded
                LocalBroadcastManager.getInstance(this@MqttForegroundService).sendBroadcast(Intent("NEW_MESSAGE").apply {
                    putExtra("payload", payload)
                    putExtra("time", System.currentTimeMillis())
                })
            }
            // … other callbacks
        })
        client.connect()
    }

    // … onDestroy disconnect, notification boilerplate etc (full code on gist below)
}
