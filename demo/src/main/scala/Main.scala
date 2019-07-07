import vtk.VtkType
import vtk.core._
import vtk.data._
import vtk.io._

import scalanative._
import unsafe._
import interop.AutoreleasePool

object Main {
  def main(args: Array[String]): Unit = AutoreleasePool{ implicit pool =>
//    val data = vtkStructuredPoints().autorelease
//    data.SetDimensions(3,2,1)
//    data.AllocateScalars(VtkType.DOUBLE,1)
//
//    data(0,0,0) = 1.0
//    data(1,0,0) = 2.0
//    data(2,0,0) = 3.0

//    val xdata = libc.stdlib.malloc(3*sizeof[Double]).asInstanceOf[Ptr[Double]]
    val xcoords = vtkDoubleArray().autorelease
    val ycoords = vtkDoubleArray().autorelease
    val zcoords = vtkDoubleArray().autorelease

    for(i <- 0 to 3)
      xcoords.InsertNextValue(i)

    for(i <- 0 to 3)
      ycoords.InsertNextValue(i)

    for(i <- 0 to 3)
      zcoords.InsertNextValue(i)

    val data = vtkRectilinearGrid().autorelease
    data.SetDimensions(3,3,3)
    data.SetXCoordinates(xcoords)
    data.SetYCoordinates(ycoords)
    data.SetZCoordinates(zcoords)

    println(data.GetNumberOfCells())

    val writer = vtkXMLRectilinearGridWriter().autorelease
    writer.SetFileName(c"out.vtr")
    writer.SetInputData(data)
    writer.Write()
  }
}
