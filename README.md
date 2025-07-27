# 💬 ChatApp - Real-Time Chat Application

Модерно чат приложение изградено с Spring Boot и WebSocket за real-time комуникация.

## 🚀 Функционалности

- **Real-time чат** - Моментална комуникация между потребители
- **Множество стаи** - Общ чат, Технологии, Мемета
- **Публичен достъп** - Без регистрация или вход
- **Responsive дизайн** - Работи на всички устройства
- **Модерен UI** - Bootstrap 5 дизайн

## 🛠️ Технологии

- **Backend:** Spring Boot 3.5.4
- **Frontend:** HTML5, CSS3, JavaScript
- **WebSocket:** STOMP over SockJS
- **UI Framework:** Bootstrap 5
- **Build Tool:** Maven
- **Java Version:** 17

## 📋 Изисквания

- Java 17 или по-нова версия
- Maven 3.6+
- Интернет връзка (за CDN ресурси)

## 🔧 Инсталация и стартиране

### 1. Клониране на проекта
```bash
git clone <repository-url>
cd ChatApp
```

### 2. Стартиране на приложението
```bash
# Windows
.\mvnw.cmd spring-boot:run

# Linux/Mac
./mvnw spring-boot:run
```

### 3. Отваряне в браузъра
```
http://localhost:8080
```

## 🎯 Как да използвате приложението

1. **Отворете** `http://localhost:8080` в браузъра
2. **Въведете вашето име** в полето "Вашето име"
3. **Изберете стая** от падащото меню
4. **Напишете съобщение** и натиснете "Изпрати"
5. **Сменете стаята** за да видите различни теми

## 🏗️ Архитектура

```
ChatApp/
├── src/main/java/com/chat/chatapp/
│   ├── ChatAppApplication.java      # Главен клас
│   ├── controller/
│   │   └── ChatController.java      # WebSocket контролер
│   ├── model/
│   │   └── ChatMessage.java         # Модел за съобщения
│   └── config/
│       └── WebSocketConfig.java     # WebSocket конфигурация
├── src/main/resources/
│   ├── templates/
│   │   └── chat.html               # Главна страница
│   └── application.properties      # Конфигурация
└── pom.xml                        # Maven зависимости
```

## 🔌 WebSocket Endpoints

- **WebSocket URL:** `/chat`
- **Message Mapping:** `/app/chat/{room}`
- **Topic Subscription:** `/topic/{room}`

### Поддържани стаи:
- `general` - Общ чат
- `tech` - Технологии  
- `funny` - Мемета

## 🎨 UI Компоненти

- **Header** - Заглавие на приложението
- **Username Input** - Поле за въвеждане на име
- **Room Selector** - Избор на чат стая
- **Chat Container** - Област за съобщения
- **Message Input** - Поле за писане
- **Send Button** - Бутон за изпращане

## 📱 Responsive Design

Приложението е напълно responsive и работи на:
- 🖥️ Desktop компютри
- 📱 Мобилни телефони
- 📱 Таблети
- 💻 Лаптопи

## 🔧 Конфигурация

### application.properties
```properties
spring.application.name=ChatApp
server.port=8080
spring.thymeleaf.cache=false
logging.level.com.chat.chatapp=DEBUG
```

### Промяна на порт
За да промените порта, редактирайте `application.properties`:
```properties
server.port=9090
```

## 🚀 Разработка

### Добавяне на нова стая
1. Отворете `chat.html`
2. Добавете нов `<option>` в `roomSelect`
3. Добавете логика в JavaScript

### Промяна на дизайна
- CSS стиловете са в `<style>` секцията на `chat.html`
- Bootstrap класове за responsive дизайн
- Custom CSS за специфични елементи

## 🐛 Troubleshooting

### Проблем: Приложението не се стартира
- Проверете дали Java 17 е инсталиран
- Проверете дали порт 8080 е свободен
- Изпълнете `mvn clean install`

### Проблем: WebSocket не работи
- Проверете дали браузърът поддържа WebSocket
- Проверете firewall настройките
- Проверете конзолата за JavaScript грешки

### Проблем: Съобщенията не се показват
- Проверете дали сте въвели име
- Проверете дали сте в правилната стая
- Проверете WebSocket връзката

## 📄 Лиценз

Този проект е с отворен код и може да се използва свободно.

## 🤝 Принос

Приветстваме приноси към проекта! Моля:
1. Fork-нете проекта
2. Създайте feature branch
3. Направете промените
4. Създайте Pull Request

## 📞 Поддръжка

За въпроси или проблеми:
- Създайте Issue в GitHub
- Проверете документацията
- Тествайте в различни браузъри

---

**Направено с ❤️ и Spring Boot**
