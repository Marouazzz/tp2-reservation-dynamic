reservation-project/
│
├── pom.xml
│
└── src/
└── main/
├── java/
│   └── com/reservation/
│       │
│       ├── model/                    ← Entités
│       │   ├── Client.java
│       │   └── Reservation.java
│       │
│       ├── dao/                      ← Couche DAO
│       │   ├── DBConnection.java
│       │   ├── IDAOClient.java
│       │   ├── IDAOReservation.java
│       │   ├── impl/
│       │   │   ├── ClientDAOImpl.java
│       │   │   └── ReservationDAOImpl.java
│       │
│       ├── metier/                   ← Couche Métier
│       │   ├── IMetierClient.java
│       │   ├── IMetierReservation.java
│       │   └── impl/
│       │       ├── ClientMetierImpl.java
│       │       └── ReservationMetierImpl.java
│       │
│       └── web/                      ← Servlets
│           ├── CreerClientServlet.java
│           └── CreerReservationServlet.java
│
└── webapp/
├── index.jsp                     ← Page publique
├── WEB-INF/
│   ├── web.xml
│   └── views/                    ← JSPs PRIVÉES ✅
│       ├── inscription.jsp
│       ├── infoClient.jsp
│       ├── reservation.jsp
│       └── infoReservation.jsp