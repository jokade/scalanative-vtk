import scala.scalanative.unsafe.CLongLong

package object vtk {
  type vtkIdType = CLongLong

  type VtkType = Int
  object VtkType {
    val VOID           :VtkType = 0
    val BIT            :VtkType = 1
    val CHAR           :VtkType = 2
    val SIGNED_CHAR    :VtkType =15
    val UNSIGNED_CHAR  :VtkType = 3
    val SHORT          :VtkType = 4
    val UNSIGNED_SHORT :VtkType = 5
    val INT            :VtkType = 6
    val UNSIGNED_INT   :VtkType = 7
    val LONG           :VtkType = 8
    val UNSIGNED_LONG  :VtkType = 9
    val FLOAT          :VtkType =10
    val DOUBLE         :VtkType =11
    val ID_TYPE        :VtkType =12
  }
}
