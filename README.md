## Финальный проект 8 спринта
___
### Задание

На банковской карте можно напечатать данные владельца. Чтобы это сделать, принтеру передают строку с именем и фамилией — например, «Тимоти Шаламе». Её получится напечатать, если соблюдены требования:
- в строке не меньше 3 и не больше 19 символов,
- в строке есть только один пробел,
- пробел стоит не в начале и не в конце строки.

Твоя программа должна проверять, можно ли напечатать строку на карте. Например, «Тимоти Шаламе» — можно, а «ТимотейШевроле» — нет.
Программа будет состоять из двух классов:
- основной класс для запуска;
- класс с методом валидации строки, которая содержит имя и фамилию.

### Что нужно сделать
1. Напиши код программы в IDEA.
2. Напиши проверки: полностью покрой класс Account тестами.
3. Выложи код программы и тесты на GitHub.
4. Подними Jenkins локально.
5. Настрой прогон проверок в Jenkins, чтобы тесты не падали.
6. Добавь Allure к коду тестов и проследи, чтобы отчёт появился в Jenkins.
___

### Используемые технологии в проекте

| Технология  | Версия |
|-------------|--------|
| Java        | 11     |
| JUnit       | 4.13.2 |
| Maven       | 4.0.0  |
| Allure      | 2.10.0 |
___
### Запуск
Чтобы запустить проект, выполните следующую команду:

`mvn clean test`

___