package com.example.greenpanion

class RegisterValidation {
    object EmailRegisterValidation {
        fun regexEmailValid(email: String): Boolean {
            val regex = """^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$"""

            return email.matches(Regex(regex))
        }
    }

}