# Trainer Contact Sync Backend

## Overview

The **Trainer Contact Sync Backend** is a RESTful API service that provides contact information for users enrolled in training sessions. It is designed to integrate with an Android application, allowing trainers to sync contact details directly to their mobile devices. The backend handles data retrieval, user management, and communication with the database.

## Features

- **API Endpoints:**
  - **Get Today's Contacts:** Fetches the list of users added to the database today.
  - **Create New User:** Adds a new user to the database.
  - **Manage Users:** Update or delete user information.
- **Database Integration:** Supports both NoSQL databases MongoDB for storing user data.
- **Scalable Architecture:** Built with Spring Boot, allowing for easy scaling and maintenance.

## Technologies Used

- **Java:** The core programming language used.
- **Spring Boot:** For creating the RESTful API service.
- **MongoDB:** Used for storing user data.


## Getting Started

### Prerequisites

- **Java 11 or later**
- **Maven** for building the project

### Installation

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/utkarshxf/trainer-contact-sync-backend.git
