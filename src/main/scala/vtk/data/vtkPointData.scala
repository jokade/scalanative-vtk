package vtk.data

import scalanative._
import unsafe._
import cxx._

/**
 * @see [[https://vtk.org/doc/nightly/html/classvtkPointData.html]]
 */
@Cxx
@include("<vtkPointData.h>")
class vtkPointData extends vtkDataSetAttributes {

}
