#language: es

Característica:  consultar api de dummy restapiexample

  Escenario: Consultar api exitoso
    Cuando envia la siguiente informacion de usuario al servicio "https://dummy.restapiexample.com/api/v1/employees"
      | status   | id    |employee_name   |employee_salary |employee_age  |profile_image     |
      | success | 1   |Tiger Nixon  |320800 |61  |0     |

    Entonces el usuario valida el codigo de estatus sea 405


