# Taskify: Streamlining Your Day, One Task at a Time.

## Table of Contents
1. [Project Name and Tagline](#1-project-name-and-tagline)
2. [Team Members](#2-team-members)
3. [Technologies](#3-technologies)
4. [Challenge Statement](#4-challenge-statement)
5. [Risks](#5-risks)
6. [Infrastructure](#6-infrastructure)
7. [Existing Solutions](#7-existing-solutions)

---

### 1. Project Name and Tagline

**Project Name:** Taskify  
**Tagline:** Streamlining Your Day, One Task at a Time.

### 2. Team Members

**Team:**
- Yabs Mullo - *Project Manager & Android Developer*
- [Team Member Name] - *UI/UX Designer*
- [Team Member Name] - *Backend Developer*

**Roles:**
- **Project Manager & Android Developer:** Responsible for overall project management, Android app development, and integration of features.
- **UI/UX Designer:** Focuses on designing an intuitive and user-friendly interface.
- **Backend Developer:** Works on the server-side logic and database integration.

*Why these roles:*
- The distribution of roles ensures a well-rounded development team, with expertise in app development, design, and backend functionality.

### 3. Technologies

**Technologies:**
- *Languages:* Java (Android Development), XML (UI)
- *Framework:* Android SDK
- *Database:* SQLite for local storage
- *Backend:* Firebase for cloud-based data storage (or your preferred backend technology)

*Trade-offs:*
- Considered using Room for local database storage but opted for SQLite due to its simplicity for a smaller-scale app.
- Firebase was chosen for its ease of integration and real-time database capabilities.

### 4. Challenge Statement

**Challenge:**
- The Taskify app aims to simplify task management, reminder setting, and schedule organization for users.

**What it will not solve:**
- Taskify will not provide advanced project management features but will focus on daily task management.

**Who it will help:**
- Taskify targets individuals seeking a straightforward and efficient way to manage their daily tasks and appointments.

*Locale Dependence:*
- The app is not dependent on a specific locale, making it accessible to users globally.

### 5. Risks

**Technical Risks:**
- Integration with Firebase: Ensuring a smooth integration with Firebase for real-time updates.
- Cross-device Compatibility: Ensuring the app works seamlessly across various Android devices.

**Non-Technical Risks:**
- User Adoption: The challenge of convincing users to switch from existing task management tools to Taskify.

### 6. Infrastructure

**Branching and Merging:**
- Utilizing Git and GitHub for version control, following the GitHub flow for branching and merging.

**Deployment Strategy:**
- Continuous integration for automated builds and manual deployment for testing phases.

**Populating App with Data:**
- Initially, data will be stored locally using SQLite. Firebase will be used for cloud storage and synchronization.

**Testing:**
- Automated testing using JUnit and Espresso for unit and UI testing.

### 7. Existing Solutions

**Existing Solutions:**
- Todoist, Microsoft To Do, Google Keep

**Comparison:**
- Taskify aims for simplicity and a focused feature set compared to more complex project management apps.

**Reason for Reimplementation:**
- Taskify focuses on a niche of users who prefer a straightforward and easy-to-use task management app.