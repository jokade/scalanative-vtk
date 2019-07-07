package vtk.data

import vtk.core.vtkDataArray

import scalanative._
import unsafe._
import cxx._

/**
 * @see [[https://vtk.org/doc/nightly/html/classvtkRectilinearGrid.html]]
 */
@Cxx
@include("<vtkRectilinearGrid.h>")
class vtkRectilinearGrid extends vtkDataSet {
  def SetDimensions(i: Int, j: Int, k: Int): Unit = extern

  def GetDataDimension(): Int = extern

  def SetXCoordinates(xcoords: vtkDataArray): Unit = extern
  def SetYCoordinates(ycoords: vtkDataArray): Unit = extern
  def SetZCoordinates(zcoords: vtkDataArray): Unit = extern
}

object vtkRectilinearGrid {
  @cxxName("New")
  def apply(): vtkRectilinearGrid = extern
}
