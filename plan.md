# Plan

* Exploring the application of rewrite strategies in Lift optimised for Image processing
* Euan McGrevey
* 2255355
* Michel Steuwer

Week-by-week plan for the whole project.

## Winter semester

* **Week 1**
* **Week 2**
* **Week 3**
* **Week 4**
 - Write first bit of Lift, looking at nearest neighbour image upscaling
 - Look at Halide for inspiration steps in pipeline I can look to implement as well

* **Week 5**
 - Rewrite naive nearest neigbour implementation to use Lift primitives

* **Week 6**
 - As unable to write naive NN functionally, write much simpler version of algorithm in raw scala without Lift primitives.
 - Looking to the future, have a look at how Tomas (PHD student) has used Elevate to encode the application of rewrite rules for image blurring
 - Have another look at other image processing pipelines to write next

* **Week 7**
 - Rewrite NN upscale to use lift primitives, will need padClamp to replace our generator function
 - Investigate and play around with the different code generators for NN upscale (C, openCL, openMP) and the different primitives necessary

* **Week 8**
 - Draw diagrams to aid with the understanding of rewrite rules, similar to drawings of array manipulation necessary to do simple upscale

* **Week 9**
 - Taken off to give more time to coursework

* **Week 10**
 - Write very simple rewrite rule converter which takes 1 rule and 1 goal rule and tries to apply a function to turn input rule into output.
 - Stretch goal: Build upon previous step and look at chaining multiple transformations together, and begin looking at more complex rewrite rules.

* **Week 11 [PROJECT WEEK]**
* **Week 12 [PROJECT WEEK]** 

 - Status report submitted.

## Winter break

## Spring Semester

* **Week 13**

 - Develop simple transformer that can apply multiple rules in a strict order to transform between two expressions
 - Deliverable: Function that outputs whether it is possible to transform from one expression into the other using the strict ordering of the rules

* **Week 14**

 - Stop using Rise for now, develop Scala-only tree backtracking algorithm that has a similar structure to Rise (that is, keep RewriteResults and Rule application). 
 - Deliverable: Have project set up and running a simple rule application on a single node without any traversal.

* **Week 15**

 - Add traversal methods to the tree class that we can use when trying to apply rules. At this point it shouldn't be too disimilar to AST traversal in Rise.
 - Add some tests that demonstrates we can do rule application that uses Breadth-first/Depth-first search and simple backtracking.
 - Deliverable: Working backtracking / other traversals that pass tests and set of new rules that can utilize these new traversals.

* **Week 16**

 - Build on earlier written applyEverywhere and applyOnce functions to build a function applyOnceNTimes that gives all possible results of applying a rule once in every possible location of a tree.
 - Write another function simpleTransform that takes a set a rules now rather than a single one, and tries to decide whether some simple trees can be transformed into one another. Start with something barely non-trivial such as two rules, one of which can never be applied, and the other rule needs to be applied twice to achieve the desired result.

 - Keep in mind that the end goal is to develop a function that can take an arbitrary set of rules, a start and goal expression, and if it is possible, return the sequence of rule applications and locations that turn the start into goal.
 - Deliverable: The desired functions.

* **Week 17**

 - Keep working towards universal expression translator as described above
 - Do so by starting work on a expression transformer that can take 2 rules and two expressions, and decides whether or not the rules can take you from one to the other.
 - More complicated: Change the return value of the function to show which rules at which point in the expression do the job

* **Week 19**

 - Research on how to best evaluate the effectiveness of the final system
 - Write Dissertation shell
 - Deliverable: Detailed evaluation and analysis plan

* **Week 20**

 - Final Implementation
 - Continue writing dissertation
 - Deliverable: Software that builds without error and passes acceptance tests to ensure ready for evaluation stage

* **Week 21**

 - Same as Week 20, adapt if problems

* **Week 22**

 - Same as Week 20
 - Evaluation experiments run
 - Deliverable: Quantative measures of the time taken to run key functions on several kinds of inputs, and correctness of such results.
 - Deadline to submit first draft of dissertation to supervisor for feedback

* **Week 23 [TERM ENDS]**

 - Minimal work on actual project, shouldn't be touched after this week. Focus on dissertation.

* **Week 24** 

 - Dissertation submission deadline and presentations.

