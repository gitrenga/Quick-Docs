# Tools for documentation :


| Tool                  | Syntax Style                          | Strengths                                                                 | Typical Uses                                      |
|-----------------------|---------------------------------------|----------------------------------------------------------------------------|---------------------------------------------------|
| **Mermaid**           | Markdown‑like (`graph TD; A-->B`)     | Native support in GitHub/GitLab/MkDocs; easy to embed; good for multiple diagram types | Project docs, wikis, lightweight UML              |
| **Graphviz / DOT**    | Declarative graph syntax (`digraph {}`) | Mature; powerful layout algorithms; handles complex graphs well           | Network diagrams, dependency graphs               |
| **Kroki**             | Aggregator (PlantUML, Mermaid, DOT…)  | Supports many syntaxes; self‑hostable; generates diagrams on the fly       | Mixed‑syntax documentation pipelines              |
| **Structurizr DSL**   | C4‑model‑focused DSL                   | Great for architecture diagrams; integrates with C4 tooling                | System context, container, component diagrams     |
| **AsciiDoctor Diagram** | Multiple syntaxes inside AsciiDoc    | Keeps diagrams inline with text; supports PlantUML, Graphviz, Mermaid      | Technical docs with embedded diagrams             |
| **ZenUML**            | Minimal DSL for sequence diagrams      | Clean syntax; integrates with Confluence/GitHub                            | API call flows, process sequences                  |