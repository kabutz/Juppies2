# Juppies2.0

Projects for the Juppies 2.0 Course

## Setting up

The recommended IDE is [IntelliJ IDEA Community 2020](https://www.jetbrains.com/idea/download/). You may use [Apache NetBeans 12.0](https://netbeans.apache.org/download/) or [Eclipse 2020](https://www.eclipse.org/downloads/).  Later versions should work too.

The repository can be cloned in the IDE.

* IntelliJ IDEA
  * File->New->Project from Version Control...
    * Version control: Git
    * URL: https://github.com/kabutz/Juppies2.git
    * Directory: Your choice
    * Click `Clone`

* NetBeans
  * Team->Git->Clone
    * Repository URL: https://github.com/kabutz/Juppies2.git
    * Clone into: Your choice
    * Click `Finish`

* Eclipse users, please do the following:
  * Switch to the Git perspective:
    * Window->Perspective->Open Perspective->Other...
    * Choose `Git`
    * In the "Git Repositories" view, click `Clone a Git repository`.
    If you already have Git repositories, click the second button in the small toolbar, with tooltip `Clone a Git Repository and add the clone to this view` 
      * URI: https://github.com/kabutz/Juppies2.git
      * Next, Next
      * Directory: Your choice
      * Click `Finish
  * File->Open Projects from File System...
    * Import source: The directory you chose previously (with `/Juppies2` at the end)
    * Click `Finish`
  * Switch to the Java perspective, either by clicking the button in the top-right corner with a J icon, or using the method above when switching to the Git perspective.

*For both IDEs, you might also have to set up your JDK.
  
## Running the examples

### AnagramGame

The main class is `Anagrams` in `src/main/java/com/toy/anagrams/ui`.