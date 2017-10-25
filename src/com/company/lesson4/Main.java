package com.company.lesson4;

import java.util.Scanner;

public class Main {
    public static void main(String[] Args){

/*
    read 3 float numbers and check: are they all belong to the range [-5,5];
    read 3 integer numbers and write max and min of them;
    read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)
*/

        Scanner scanner = new Scanner(System.in);
        Part1 example = new Part1(scanner);


        //task a
        float f1, f2, f3;
        System.out.println("Read 3 float numbers and check: are they all belong to the range [-5,5]");
        f1 = example.readFloat();
        f2 = example.readFloat();
        f3 = example.readFloat();
        if (example.belongsToRange(f1) && example.belongsToRange(f2) && example.belongsToRange(f3))
        {
            System.out.println("All float numbers belong to the range [-5,5]\n");
        }
        else{
            System.out.println("At least one of entered number does not belong to range [-5,5]\n");
        }


        //task b
        int i1, i2, i3;
        System.out.println("Read 3 integer numbers and write max and min of them");
        i1 = example.readInt();
        i2 = example.readInt();
        i3 = example.readInt();
        System.out.println("Max value is: " + example.returnMax(i1,i2,i3));
        System.out.println("Min value is: " + example.returnMin(i1,i2,i3) + "\n");


        //task c
        HTTPError httpError = null;
        System.out.println("Please enter HTTP error code (401-408):");
        int errorCode = example.readInt();
        if ((errorCode>=401) &&(errorCode<=408)){
            switch (errorCode){
                case 400:
                    httpError = HTTPError.BADREQUEST;
                    break;
                case 401:
                    httpError = HTTPError.UNAUTHORIZED;
                    break;
                case 402:
                    httpError = HTTPError.PAYMENTREQUIRED;
                    break;
                case 403:
                    httpError = HTTPError.FORBIDDEN;
                    break;
                case 404:
                    httpError = HTTPError.NOTFOUND;
                    break;
                case 405:
                    httpError = HTTPError.METHODNOTALLOWED;
                    break;
                case 406:
                    httpError = HTTPError.NOTACCEPTABLE;
                    break;
                case 407:
                    httpError = HTTPError.PROXYAUTHENTICATIONREQUIRED;
                    break;
                case 408:
                httpError = HTTPError.REQUESTTIMEOUT;
                break;

            }
            System.out.println("Your error is : " + httpError.getErrorName() + "\n");
        }
        else {
            System.out.println("Incorrect error code\n");
        }

        scanner.close();


        /*
        Сreate class Dog with fields name, breed, age. 
    Declare enum for field breed. 
    Create 3 instances of type Dog. 
    Check if there is no two dogs with the same name. 
    Display the name and the kind of the oldest dog. 
         */

        Dog[] arrDogs = new Dog[3];
        arrDogs[0] = new Dog("Sobaka1", Breed.breed1, 58);
        arrDogs[1] = new Dog("Sobaka2", Breed.breed2, 16);
        arrDogs[2] = new Dog("Sobaka3", Breed.breed2, 46);


        int oldest = 0;
        for (int i = 0; i < arrDogs.length; i++){
            if(arrDogs[oldest].getAge() < arrDogs[i].getAge()){
                oldest = i;
            }
        }
        System.out.println("The oldest dog`s name is: " + arrDogs[oldest].getName()+ "\n"+
                           "The oldest dog`s breed is: " + arrDogs[oldest].getBreed());



        int sameNameCount = 0;
        for (int i = 0; i < arrDogs.length - 1; i++) {
            for (int k = i+1; k < arrDogs.length ; k++){
                if (arrDogs[i].getName().equals(arrDogs[k].getName())){
                    //                   System.out.println("i = "+ i + "\n"+ "k = " + k + "\n"+ "Dog i:  "+
                    //                           arrDogs[i].getName() +"\nDog k: " + arrDogs[k].getName() );
                    sameNameCount = sameNameCount + 1;
                }
            }
        }
        if (sameNameCount > 0){
        System.out.println("At least 2 dogs have same names");
        }
        else {
        System.out.println("No same names of dogs");
}
        
        
    }
    
    
}
