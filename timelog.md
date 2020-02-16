# Timelog

* Exploring the application of rewrite strategies in Lift optimised for Image processing
* Euan McGrevey
* 2255355
* Michel Steuwer


## Week 1

## 23 Sep 2019

* *1 hour* meeting with supervisor
* *2 hours* doing background research on lift reading papers

## 24 Sep 2019

* *4 hours* Read the project guidance notes
* *0.5 hours* Created GitHub repository and cloned the cookiecutter for the projects 
* *1 hour*  Supervisor meeting

## 26 September 2019

* *2 hours* Background reading 

## 27 September 2019

* *1 hour* Background reading and collecting related papers
* *2 hours* Writing plan for abstract of dissertation / fleshing out the specification of the project

## Week 2

## 30 September 2019

* *3 hours* Background reading
* *2 hour*  Writing Project specification

## 1st October 2019

* *1 hour*  Redrafting project specification to have more concrete approach
* *4 Hours* Background Reading on current methods of optimising parallel programs and how they compare to lift's rewrite rule system (steuwer16beyondAutoTuning)
* *1 hour*  Supervisor meeting

## 2nd October 2019

* *1.5 hours* Background Reading

## Week 3

## 08 October 2019

* *2.5 hours* Background reading (steuwer2015thesis)
* *1 hour* Supervisor meeting - provided with access to repository for development

## 09 October 2019

* *2 hours* Background reading (ElevateDresdenSeptember2019) and collecting other papers cited

## 10 October 2019

* *1.5 hours* Installed IntelliJ IDEA but was unable to import project repo succesfully. Was able to clone from command line however. Believe I need to run on linux anyway.

## 11 October 2019

* *2 hours* Set up environment succesfully on different PC.

## Week 4

## 15 October 2019

* *3 hours* Settled on Initial application nearest neighbour upscaling
* *1 hour*  Learning basics of Scala
* *1 hour* Supervisor meeting 

## Week 5

## 22 October 2019

* *2 hours* Learning more Scala and writing naive nearest neighbour image upscaling
* *1 hour* Supervisor meeting

## 27 October 2019

* *1 hour* Beginning rewriting naive nearest neighour to use lift primitives 

## Week 6

## 28 October 2019

* *2 hours* Rewriting naive nearest neighbour, using tests to check correctness

## 29 October 2019

* *2 hours* Learning more Scala
* *2 hours* Planing out strategy for parallelisation for nearest neighbour interpolation
* *1 hour* Supervisor meeting

## 02 November 2019

* *2 hours* Rewriting nearest neighbour in raw scala

## Week 7

## 05 November 2019

* *1 hour* Writing helper functions to help debugging/printing
* *2 hours* Rewriting nearest neighbour in raw scala - complete 
* *1 hour* Supervisor meeting

## Week 8 

## 12 November 2019

* *4 hours* Writing upscale to use lift primitives, unfinished
* *1 hour* Supervisor meeting

## 18 November 2019

* *1 hour* Analysing base components that make up the `base` rewrite strategy for separableConvolution2D, preparation for drawing diagrams.

## Week 9

## 19 November 2019

* *4 hours* Drew diagrams to aid my understanding of how Lift strategies are applied to actual applications, using separableConvolution2D as an example.
* *1 hour* Supervisor meeting

## Week 10

Took off to focus on coursework

## Week 11

## 3 December 2019

* *1 hour* Supervisor meeting, taking week off to study for exam
* *2 hours* Tried to write basic expression transformer

## Week 12

## 16 December 2019

* *0.5 hours* Forked Repository in order to modify and commit code
* *0.5 hours* Typed up meeting notes up to date
* *2.5 hours* Writing basic expression transformer

## 17 December 2019

* *4 hours* Writing basic expression transformer, gaining better understanding of how strategies are applied, and necessity for more sophisticated traversal of expression AST to apply rules.
* *1 hour* Final Supervisor meeting of term


## Week 13

## 10 January 2020

* *1 hour* Created provisional plan for second semester

## 13 January 2020

* *0.5 hours* Added supervisor provided code to repo, build errors, will look at tomorrow.

## 14 January 2020

* *2 hours* Worked on function that tries to decide whether a given rule can be applied at any point in a given expression.
* *1.5 hours* Continued trying to add supervisor's code to the project
* *1 hour* Supervisor meeting

## Week 14

## 20 January 2020

* *1 hour* Writing up project notes
* *1 hour* Setting up new scala project as per meeting 14

## 26 January 2020

* *1.5 hours* Created Tree and RewriteResult traits
* *1,5 hours* Added type definition of Strategy and test rule. Tested rule application was successful.

## Week 15

## 28 January 2020

* *1 hour* Set up new Rise repository on local machine
* *1 hour* Supervisor Meeting
* *2 hours* Writing ApplyEverywhere method for strategies

## 01 February 2020

* *2 hours* Writing Abstract and Introduction of dissertation

## 02 February 2020

* *1 hour* Writing applyOnce method for strategy application

## Week 16

## 03 February 2020

* *1 hour* Supervisor Meeting
* *2 hours* fixing issues with applyOnce method
* *1 hour* Writing applyOnceNTimes method

## 08 February 2020

* *2 hours* Writing applyOnceNTimes method; more difficult than anticipated, tried different approach

## 09 February 2020

* *0.5 hours* wrote applyOnceNTimes method, without regard to efficiency - has bugs, only works for simple cases

## Week 17 

## 10 February 2020 

* *3 hours* Debugging applyOnceNTimes method
* *1 hour* Supervisor meeting

## 16 February 2020

* *0.5 hours* Cleaning up code from supervisor meeting so that project builds
