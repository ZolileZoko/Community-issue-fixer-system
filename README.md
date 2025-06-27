# 🛠️ FixIt – Community Issue Reporting & Reward Platform

**FixIt** is a full-stack Java web application that enables communities to report local infrastructure issues (like potholes, water leaks), assign them to approved fixers, and reward those who successfully resolve them. The platform fosters accountability, transparency, and incentivized participation in community upkeep.

---

## 🌍 Real-World Use Case

FixIt is ideal for:
- Municipalities improving service delivery
- University campuses managing maintenance issues
- Residential communities organizing civic participation

---

## 🚀 Features

### 👥 Roles
- **Admin**
  - Validates submitted issues
  - Registers and manages fixers
  - Updates reward points for successful fixes
  - Fulfills reward redemptions
- **Member**
  - Reports community issues with description and location
  - Comments or provides feedback on resolved issues
- **Fixer**
  - Requests issues to fix
  - Submits fix reports with proof
  - Earns and redeems reward points

### 🔧 Core Functionalities
- Role-based login system
- Issue tracking with status updates
- Comment and feedback system
- Reward points for fixers
- Redeemable rewards catalog
- Admin interface for approvals

---

## 🧰 Tech Stack

### 🔙 Backend
- **Java + Spring Boot** – RESTful API
- **Spring Security + JWT** – Authentication & authorization
- **Hibernate (JPA)** – ORM mapping to PostgreSQL
- **PostgreSQL** – Relational database

### 🌐 Frontend (Web)
- **React** *(or HTML/CSS/JavaScript for MVP)*
- **Axios or Fetch API** – REST communication
- **TailwindCSS or Material UI** – Styling *(optional)*

### 🧪 Dev & Ops
- **Build Tool**: Maven or Gradle
- **API Testing**: Postman / Swagger UI
- **Version Control**: Git + GitHub or Bitbucket
- **Deployment**: Render / Railway / Heroku *(optional)*

---

## 📂 Project Structure

FixIt/
├── backend/
│ ├── src/main/java/com/fixit/
│ │ ├── controllers/
│ │ ├── services/
│ │ ├── models/
│ │ ├── repositories/
│ │ └── config/
│ └── resources/
│ └── application.properties
├── frontend/
│ └── (React or HTML/CSS/JS files)
├── database/
│ └── schema.sql
├── README.md
└── LICENSE