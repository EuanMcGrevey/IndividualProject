import scala.util.Random

object testBasicNearestNeighbour {

  def main(args: Array[String]): Unit = {

    val rows: Int = 2
    val cols: Int = rows
    val scalRows: Int = 2
    val scalCols: Int = scalRows

    val input: Array[Array[Double]] = Array.ofDim[Double](rows,cols)
    var inter: Array[Array[Array[Array[Double]]]] = Array.ofDim[Double](rows,cols,scalRows,scalCols)
    var output: Array[Array[Double]] = Array.ofDim[Double](rows*scalRows,cols*scalCols)

    // create random input
    for (i <- 0 until rows) {
      for (j <- 0 until cols) {
        input(i)(j) = Random.nextFloat
      }
    }
    printImage(input)

    inter = input.map(_.map(generate(_)))

    output = inter.map(x => (x.flatten).transpose).flatten
    printImage(output)

    // function which given a pixel, creates a 2D array of size scale by scale with every value being pixel
    def generate(pixel: Double) : Array[Array[Double]] = {
      val arr : Array[Array[Double]] = Array.fill(scalRows,scalCols)(pixel)
      arr
    }

    // print contents of Array[Array[Double]] in nice format
    def printImage(image: Array[Array[Double]]) : Unit = {
      for (row <- image) {
        for (x <- row) {
          printf(f"${x}%1.2f ")
        }
        print("\n")
      }
    }
  }
}
