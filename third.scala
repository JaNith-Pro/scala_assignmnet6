object third {
    def main(args:Array[String]){
          println("Enter the 1 st Point ")
          var i = scala.io.StdIn.readInt()
          var j = scala.io.StdIn.readInt()
          println("Enter the 2 st Point ")
          var k = scala.io.StdIn.readInt()
          var n = scala.io.StdIn.readInt()

          val p1 = point(i,j)
          val p2 = point(k,n)
          val p3 = p1.move(2,3)
          val p4 = p1.copy(a=j,b=i)

          
          println(p1+p2) // Q1
          println(p3)    // Q2
          println(p2-p1)  // Q3
          println(p4)     //Q4

      }
    
 
case class point(a:Int,b:Int){
          def x:Int = a
          def y:Int = b
        
          def   move(dx:Int,dy:Int)=point(this.x+dx,this.y+dy)

          def +(that:point)=point(this.x+that.x,this.y+that.y)

          def -(that:point)=point(this.x-that.x,this.y-that.y)
}
    

}