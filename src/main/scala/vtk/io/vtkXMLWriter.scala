package vtk.io

import vtk.data.vtkDataObject
import vtk.vtkAlgorithm

import scalanative._
import unsafe._
import cxx._

/**
 * @see [[https://vtk.org/doc/nightly/html/classvtkXMLWriter.html]]
 */
@Cxx
@include("<vtkXMLWriter.h>")
class vtkXMLWriter extends vtkAlgorithm {

  def SetFileName(filename: CString): Unit = extern
  def GetFileName(): CString = extern

  def SetInputData(obj: vtkDataObject): Unit = extern

  def Write(): Int = extern

  @returnsConst
  def GetDefaultFileExtension(): CString = extern

  def SetDataModeToAscii(): Unit = extern
  def SetDataModeToBinary(): Unit = extern
  def SetDataModeToAppended(): Unit = extern
}
