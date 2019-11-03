import scala.util.Random
import Array._

object NearestNeighbour {
  def main(args: Array[String]) : Unit = { 
    
    val len: Int = 2
      
    val input: Array[Array[Double]] = Array.ofDim[Double](len,len)
    
    var inter: Array[Array[Array[Array[Double]]]] = Array.ofDim[Double](len,len,len,len)
    var inter1: Array[Array[Double]] = Array.ofDim[Double](len,2*len)
    var inter2: Array[Array[Double]] = Array.ofDim[Double](len,2*len)
    
    var output: Array[Array[Double]] = Array.ofDim[Double](2*len,2*len)
    
    for (i <- 0 until len) {
      for (j <- 0 until len) {
        input(i)(j) = Random.nextFloat
        //print(input(i)(j))
      }
    }
    
    
    
    //output = input.map(_.map(_ * 2))
    //output = input.map(_.map(generate(_)))
    inter = input.map(_.map(generate(_)))
    inter1 = (inter(0).flatten).transpose 
    inter2 = (inter(1).flatten).transpose 
    
    output = concat(inter1, inter2)
    
    // number of rows and cols should be 4
    //println(output.size) 
    //println(output(0).size) 
    
    def generate(pixel: Double) : Array[Array[Double]] = {
      val arr : Array[Array[Double]] = Array.fill(2,2)(pixel)
      arr
    }
    
    //for (i <- 0 until output.size) {
    //  for (j <- 0 until output(0).size) {
    //    println(output(i)(j))
    //  }
    //}
  }
}
