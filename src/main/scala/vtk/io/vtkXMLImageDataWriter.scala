package vtk.io

import scalanative._
import unsafe._
import cxx._

/**
 * @see [[https://vtk.org/doc/nightly/html/classvtkXMLImageDataWriter.html]]
 */
@Cxx
@include("<vtkXMLImageDataWriter.h>")
class vtkXMLImageDataWriter extends vtkXMLStructuredDataWriter {
}

object vtkXMLImageDataWriter {
  @cxxName("New")
  def apply(): vtkXMLImageDataWriter = extern
}
