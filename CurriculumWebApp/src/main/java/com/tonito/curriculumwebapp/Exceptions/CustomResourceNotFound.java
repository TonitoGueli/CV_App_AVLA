package com.tonito.curriculumwebapp.Exceptions;

public class CustomResourceNotFound extends RuntimeException{
    public CustomResourceNotFound(String mensaje) {
        super (mensaje); //Se debe indicar el mensaje a enviar en caso de que ocurra la excepción.
    }
}
