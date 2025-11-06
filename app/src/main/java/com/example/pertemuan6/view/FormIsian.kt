package com.example.pertemuan6.view

import androidx.compose.runtime.Composable

@Composable
fun FormIsian(
    jenisK: List<String> = listOf("Laki-laki", "Perempuan"),
    OnSubmitBtnClick: () -> Unit
) {
    Scaffold(
        modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(id = R.string.home), color = Color.White) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = colorResource(id = R.color.teal_700)
                )
            )
        }
    )
    { paddingValues ->
        Column(
            modifier = Modifier.padding(paddingValues),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            OutlinedTextField(
                value = "",
                singleLine = true,
                modifier = Modifier
                    .padding(top = 20.dp)
                    .width(250.dp),
                label = { Text(text = "Nama Lengkap") },
                onValueChange = {}
            )
            Divider(
                modifier = Modifier
                    .padding(all = 20.dp)
                    .width(250.dp),
                thickness = 1.dp,
                color = Color.Red
            )
            Row {
                jenisK.forEach { item ->
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        RadioButton(selected = false, onClick = {})
                        Text(text = item)
                    }
                }
            }
            Divider(
                modifier = Modifier
                    .padding(all = 20.dp)
                    .width(250.dp),
                thickness = 1.dp,
                color = Color.Red
            )

}