package vtk.io

import scalanative._
import unsafe._
import cxx._

/**
 * @see [https://vtk.org/doc/nightly/html/classvtkXMLRectilinearGridWriter.html
 */
@Cxx
@include("<vtkXMLRectilinearGridWriter.h>")
class vtkXMLRectilinearGridWriter extends vtkXMLStructuredDataWriter {

}

object vtkXMLRectilinearGridWriter {
  @cxxName("New")
  def apply(): vtkXMLRectilinearGridWriter = extern
}
