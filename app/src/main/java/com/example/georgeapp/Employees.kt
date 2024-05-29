package com.example.georgeapp

import com.google.firebase.firestore.Exclude

data class Employees(


    @Exclude var employeeID: String? = "",
    var employeeName: String? = "",
    var employeeAge: String? = "",
    var employeeSalary: String? = ""
)
