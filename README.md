intellij-yang
=============

This IntelliJ Plugin adds support for YANG.

## Features

- Syntax Highlighting
- Rudimentary Code Completion
- Code formatting


## Quick Start

1. Download .zip file from [release page](https://github.com/exjobo/intellij-yang/releases)
2. Go *Preferences* menu, then select *Plugins* page
3. Select *Install plugin from disk*, then choose downloaded .zip file
4. Restart IntelliJ IDEA


## Development Environment
Use the following checklist to ensure that you are ready to develop your custom
- **Gradle**
- **Plugin DevKit**
- **Grammar-kit**

This project supports Gradle build system.  
To set up the environment, you just import the cloned project with Gradle(gradlew).  
And you can test your own plugin by executing *runIde* Task.  

## Update the Yang Grammar and build new Plugin
In order to update the grammar and generate a new plugin you need to follow th following steps:
1. Update the file `grammars\Yang.bnf`
2. Right click on the file and press `Generate Parser Code`
3. Right click on the file and press `JFLex Lexer`
4. Find the generated `_YangLexer.flex`, right click on it and press `Run JFlex Generator`
5. Build the project `Gradle Plugin -> (Tasks/build/build)`
6. Build the plugin `Gradle Plugin -> (Tasks/intellij/buildPlugin)`
7. The new plugin is now at the folder `build/libs`

## License
This product is licensed under the terms of the Apache 2.0 license.
Read [LICENSE](LICENSE) for further details.

Please also see [NOTICE](NOTICE) for further details about the license and included code of other developers.
