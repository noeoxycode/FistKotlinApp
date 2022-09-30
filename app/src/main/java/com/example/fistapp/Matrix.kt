package com.example.fistapp

fun main(){
    val matrix = Matrix(5,5);
    println("coucou");
    println(matrix.toString());
    matrix[2, 2] = 5;
    println(matrix.toString());
}

class Matrix (val row: Int, val column: Int) {
    val mainMatrix : List<MutableList<Int?>> = List(row){ MutableList(column){null} };

    operator fun set(row:Int, column: Int, value: Int) {
        this.mainMatrix[row][column] = value;
    }

    override fun toString(): String {
        var newString: String = "";
        println("nono");
        for (i in 0 until  this.row) {
            newString+= "[";
            for (j in 0 until  this.column) {
                if(this.mainMatrix[i][j] == null)
                    newString += "-,";
                else
                    newString+= (this.mainMatrix[i][j].toString() + ",");
            }
            newString+= "] \n";
        }
        return newString;
    }
}