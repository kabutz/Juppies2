# Juppies2

Projects for the Juppies 2 Course

## Setting up

Most Java programmers use an integrated development environment (IDE). This helps
with making the Java Programming Language easier to work with. Any errors that
we make are automatically highlighted in the IDE.

Before setting up an IDE, it is best to first download and install a Java 
Development Kit (JDK).  Please download and install the latest JDK from
[Oracle's website](https://www.oracle.com/uk/java/technologies/javase-downloads.html).

Let's get back to the IDE. Three main IDEs have emerged:

* Apache NetBeans
  * Fully open source. Works well for building graphical user interfaces. It is
  based on NetBeans Platform, which is used by lots of companies for creating
  rich client interfaces. NetBeans used to belong to Oracle, but was donated
  to the Apache Software Foundation.
  
* IntelliJ IDEA
  * Has a commercial and a free open source version. IDEA is used by lots of
  pros. It is highly configurable and easy to use. Companies often buy site
  licenses for their programmers to use their "ultimate" edition.
  
* Eclipse
  * Also fully open source. Eclipse is used by lots of enterprises who want to
  save money. It also has a user interface framework that looks more like a 
  native application than the other alternatives.
  
Which one should you use?

Like so many things, this is a matter of personal preference. Whilst a lot of 
public Java speakers use IntelliJ IDEA, there is a small, but influential, tribe
of NetBeans fans that will use nothing else on pain of death. Similarly, 
Eclipse, in combination with some commercial plugins, is also a popular option.

Since the author of this course is most familiar with IntelliJ IDEA, the demos
will be done with that. However, these are all plain Java code, so any IDE will
do. We will also show how to set up all three IDEs in this course.  Similarly, 
because the author uses Mac OS X exclusively, the demos will be done on that
 machine. Windows and Linux will be similar.

* [Apache NetBeans](https://netbeans.apache.org/download/) 12.0 or later
  * Team->Git->Clone
    * Repository URL: https://github.com/kabutz/Juppies2.git
    * Clone into: Your choice
    * Click `Finish`

* [Eclipse](https://www.eclipse.org/downloads/) 2020 or later
  * Switch to the Git perspective:
    * Window->Perspective->Open Perspective->Other...
    * Choose `Git`
    * In the "Git Repositories" view, click `Clone a Git repository`.
    If you already have Git repositories, click the second button in the small 
    toolbar, with tooltip `Clone a Git Repository and add the clone to this view` 
      * URI: https://github.com/kabutz/Juppies2.git
      * Next, Next
      * Directory: Your choice
      * Click `Finish
  * File->Open Projects from File System...
    * Import source: The directory you chose previously (with `/Juppies2` at 
    the end)
    * Click `Finish`
  * Switch to the Java perspective, either by clicking the button in the top-right 
  corner with a J icon, or using the method above when switching to the Git perspective.

* [IntelliJ IDEA Community](https://www.jetbrains.com/idea/download/) 2020 or later 
  * File->New->Project from Version Control...
    * Version control: Git
    * URL: https://github.com/kabutz/Juppies2.git
    * Directory: Your choice
    * Click `Clone`
 
## Running the examples

### AnagramGame

The main class is `Anagrams` in `src/main/java/com/toy/anagrams/ui`.
