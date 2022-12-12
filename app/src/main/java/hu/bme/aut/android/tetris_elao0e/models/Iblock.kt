package hu.bme.aut.android.tetris_elao0e.models


class Iblock(x:Int, y:Int): Block(x,y){

    init {
        pB = Point(x - 1, y)
        pC = Point(x + 1, y)
        pD = Point(x + 2, y)
        rotate = 2
    }

    override fun moveDown() {
        pA.moveDown()
        pB.moveDown()
        pC.moveDown()
        pD.moveDown()
    }

    override fun moverotate() {
        if (state){
            pB.x = pA.x
            pB.y = pA.y-1
            pC.x = pA.x
            pC.y = pA.y+1
            pD.x = pA.x
            pD.y = pA.y+2
            state = false
        }else{
            pB.x = pA.x-1
            pB.y = pA.y
            pC.x = pA.x+1
            pC.y = pA.y
            pD.x = pA.x+2
            pD.y = pA.y
            state = true
        }
    }

    override fun moveLeft() {
        pA.moveLeft()
        pB.moveLeft()
        pC.moveLeft()
        pD.moveLeft()
    }

    override fun moveRight() {
        pA.moveRight()
        pB.moveRight()
        pC.moveRight()
        pD.moveRight()
    }

}