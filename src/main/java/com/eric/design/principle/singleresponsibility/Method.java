package com.eric.design.principle.singleresponsibility;

public class Method {
    private void  updateUserInfo(String userName,String address){
        userName="geely";
        address="beijing";
    }
    private void  updateUserInfo(String userName,String... properties){
        userName="geely";
    }
    private void updateUserName(String userName){
        userName ="geely";
    }
    private void updateUserAddress(String address){
        address="beijing";
    }
    private void updateUserInfo(String userName,String address,boolean bool){

        if(bool){
            //todo something
        }else{
            //todo something2
        }
    }
}
