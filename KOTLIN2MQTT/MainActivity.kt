class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Start foreground service so it survives background/screen off
        val serviceIntent = Intent(this, MqttForegroundService::class.java)
        ContextCompat.startForegroundService(this, serviceIntent)
    }
}
