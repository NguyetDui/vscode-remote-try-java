/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;
class Number {
    public int i;

    // Phương thức để gán giá trị cho thuộc tính i của một đối tượng Number
    public void setI(int value) {
        this.i = value;
    }
}

public class App {
    public static void main(String[] args) {
        //assignment 1
        System.out.println("Hello Remote World!");
        Number n1 = new Number();
        Number n2 = new Number();
        n1.i = 2;
        n2.i = 5;
        
        // Gọi phương thức setI để gán giá trị từ n2.i cho n1.i
        n1.setI(n2.i);
        
        n2.i = 10;

        System.out.println("n1.i = " + n1.i); // Kết quả: n1.i = 10
    }
}
