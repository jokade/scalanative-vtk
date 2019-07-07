package vtk.data

import scalanative._
import unsafe._
import cxx._

/**
 * @see [[https://vtk.org/doc/nightly/html/classvtkUniformGrid.html]]
 */
@Cxx
@include("<vtkUniformGrid.h>")
class vtkUniformGrid extends vtkImageData {

}

object vtkUniformGrid {
  @cxxName("New")
  def apply(): vtkUniformGrid = extern
}
