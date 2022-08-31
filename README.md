# weather_reactive

### Приложение прогноз погоды в режиме реактивного программирования.

#### В приложении четыре запроса.

1. Показать список всех городов с погодой `/all`.

2. Показать детальную погоду по выбранному городу `/get/{id}`.

3. Показать погоду городов выше заданной температуры `/cityGreatThen/{maxTemp}`

4. Показать город с максимальной температурой `/hottest`

* `http://localhost:8080/all`

* `http://localhost:8080/get/1`

* `http://localhost:8080/cityGreatThen/19`

* `http://localhost:8080/hottest`
#### Объекты Mono и Flux.

Чтобы наше приложение работало в реактивном режиме между слоями передаются обертки Mono и Flux.

Mono - поток состоящий из одного элемента или пустой поток.

Flux - поток состоящий из набора объектов или пустой поток.

Во Flux намерено передается задержка для демонстрации передачи данных без ожидания полного прохода по коллекции.
#### Технологии проекта
[//]: # (![badge]&#40;https://img.shields.io/badge/PostgreSQL-14-blue&#41;)
![badge](https://img.shields.io/badge/Java-17-green)
![badge](https://img.shields.io/badge/Maven-3.6-green)
![badge](https://img.shields.io/badge/SpringBot-2.7.3-yellow)