package com.example.pertemuan6

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import java.lang.reflect.Modifier

enum class Navigasi{
    Formulir,
    Detail
}

@Composable
fun DataApp(
    navController: NavController = rememberNavController(),
    modifier: Modifier
){
    Scaffold { isiRuang->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Formulir.name,

            modifier = Modifier.padding(isiRuang)){
            composable(route = Navigasi.Formulir.name){
                FormIsian(
                    OnsubmitBtnClick = {
                        navController.navigate(Navigasi.Detail.name)
                    }
                )
            }
        }
    }


}