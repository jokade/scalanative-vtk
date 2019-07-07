package vtk

import scalanative._
import unsafe._
import cxx._
import scala.scalanative.interop.AutoReleasable

/**
 *
 */
@Cxx
@include("<vtkObject.h>")
class vtkObject extends CxxObject with AutoReleasable {
  final def Delete(): Unit = extern
  @inline final override def free(): Unit = Delete()
}
