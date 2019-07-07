package vtk.io

import scalanative._
import unsafe._
import cxx._

/**
 * @see [[https://vtk.org/doc/nightly/html/classvtkXMLStructuredDataWriter.html]]
 */
@Cxx
@include("<vtkXMLStructuredDataWriter.h>")
class vtkXMLStructuredDataWriter extends vtkXMLWriter {

}
