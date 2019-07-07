package vtk.data

import de.surfice.smacrotools.debug

import scalanative._
import unsafe._
import cxx._

/**
 * @see [[https://vtk.org/doc/nightly/html/classvtkStructuredPoints.html]]
 */
@Cxx
@include("<vtkStructuredPoints.h>")
class vtkStructuredPoints extends vtkImageData {

}

object vtkStructuredPoints {
  @cxxName("New")
  def apply(): vtkStructuredPoints = extern
}
