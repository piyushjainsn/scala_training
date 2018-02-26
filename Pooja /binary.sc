sealed trait Tree {
  def find(valueFind: Int):Any = {
    var flag = false
    this match {
      case FullNode(nId, leftChild, rightChild, num) => {
        if (valueFind == num) return nId
        else {
          var x = leftChild.find(valueFind)
          if (x == "not found"){
            var y = rightChild.find(valueFind)
            if (y == false) return "not found"
            if (y != false) return y
          }
          else return x
        }
      }
      case emptyNode() => return "not found"
    }
  }
}
case class FullNode(nodeId:Int,leftChildNode:Tree,rightChildNode:Tree,value:Int) extends Tree {}
case class emptyNode() extends Tree

object main extends App {
  def main:Any = {
    val node23 = FullNode(231,emptyNode(),emptyNode(),23)
    val node1 = FullNode(12,emptyNode(),emptyNode(),112)
    val node2 = FullNode(22,emptyNode(),node23,222)
    val rootnode = FullNode(111,node1,node2,111)
    val res = rootnode.find(2322)
    return res
  }
}

main.main

