// Nearest Neighbour Interpolation for greyscale image upscaling

import scala.math.round

def nearestNeighbour(w: Int, h: Int, in: Array[Array[Int]], outw: Int, outh: Int): Array[Array[Int]] = {

  val scalX: Float = outw.toFloat / (w)
  val scalY: Float = outy.toFloat / (h)

  // need to scale the input image 

  // initialise output image
  val outImage Array.ofDim[Int](outw)(outh)

  for (i <- 0 to outw) {
    for (j <- 0 to outy) {
      outImage[i][j] = in[round(i/scalX)][round(j/scalY)]
    }
  }
}
