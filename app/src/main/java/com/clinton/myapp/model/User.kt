package com.clinton.myapp.model

class User {

    var name:String=""
    var email:String=""
    var pass:String=""
    var confrmpass:String=""
    var userid:String=""

    constructor(name:String,email:String,pass:String,confrmpass:String,userid:String){


        this.name=name
        this.email=email
        this.pass=pass
        this.confrmpass=confrmpass
        this.userid=userid

    }
    constructor()
}