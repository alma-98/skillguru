# SkillGuru

> **Belajar Terarah, Masa Depan Cerah.**

SkillGuru adalah platform Learning Management System (LMS) modern untuk menyediakan pengalaman pembelajaran digital yang terarah, terukur, dan terintegrasi dengan teknologi AI.

## Technology Stack

### Frontend
- React
- TypeScript
- Vite

### Backend
- Java
- Spring Boot
- Maven
- Spring Security
- JWT
- Swagger / OpenAPI

### Database
- PostgreSQL

### Storage
- Object Storage

### AI
- AI Recommendation
- AI Quiz
- AI Learning Assistant
- AI Skill Analysis

## Core Modules

- Dashboard
- Courses
- Materials
- Videos
- Quizzes
- Assignments
- Certificates
- Users
- Mentors
- Categories
- Discussions
- Progress
- Payments
- Notifications
- Reports
- Settings

## Repository Structure

```text
SkillGuru/
├── frontend/
├── backend/
├── database/
├── docs/
│   ├── architecture/
│   ├── api/
│   ├── database/
│   └── sprints/
├── .github/
│   └── workflows/
├── .gitignore
├── LICENSE
└── README.md

## STEP 4 — Buat LICENSE

```bash
cat > LICENSE <<'EOF'
MIT License

Copyright (c) 2026 Alma

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,


#STRUCTURE API
SkillGuru API v1
│
├── 01 🔐 Authentication
│   ├── POST   /api/v1/auth/register
│   ├── POST   /api/v1/auth/login
│   ├── POST   /api/v1/auth/refresh
│   ├── POST   /api/v1/auth/logout
│   ├── GET    /api/v1/auth/me
│   ├── POST   /api/v1/auth/verify-email
│   ├── POST   /api/v1/auth/resend-verification
│   ├── POST   /api/v1/auth/forgot-password
│   ├── POST   /api/v1/auth/reset-password
│   ├── POST   /api/v1/auth/change-password
│   └── POST   /api/v1/auth/validate-token
│
├── 02 👤 Users
│   ├── GET    /api/v1/users
│   ├── GET    /api/v1/users/{id}
│   ├── POST   /api/v1/users
│   ├── PUT    /api/v1/users/{id}
│   ├── PATCH  /api/v1/users/{id}/status
│   ├── DELETE /api/v1/users/{id}
│   └── GET    /api/v1/users/{id}/activity
│
├── 03 👨‍🎓 Students
│   ├── GET    /api/v1/students
│   ├── GET    /api/v1/students/{id}
│   ├── POST   /api/v1/students
│   ├── PUT    /api/v1/students/{id}
│   ├── PATCH  /api/v1/students/{id}/status
│   ├── DELETE /api/v1/students/{id}
│   ├── GET    /api/v1/students/{id}/courses
│   ├── GET    /api/v1/students/{id}/progress
│   ├── GET    /api/v1/students/{id}/certificates
│   ├── GET    /api/v1/students/{id}/payments
│   ├── GET    /api/v1/students/{id}/skills
│   ├── GET    /api/v1/students/{id}/attendance
│   ├── GET    /api/v1/students/{id}/grades
│   └── GET    /api/v1/students/{id}/activity
│
├── 04 👨‍🏫 Teachers
│   ├── GET    /api/v1/teachers
│   ├── GET    /api/v1/teachers/{id}
│   ├── POST   /api/v1/teachers
│   ├── PUT    /api/v1/teachers/{id}
│   ├── PATCH  /api/v1/teachers/{id}/status
│   ├── DELETE /api/v1/teachers/{id}
│   ├── GET    /api/v1/teachers/{id}/courses
│   ├── GET    /api/v1/teachers/{id}/students
│   ├── GET    /api/v1/teachers/{id}/reviews
│   ├── GET    /api/v1/teachers/{id}/schedule
│   ├── GET    /api/v1/teachers/{id}/earnings
│   └── GET    /api/v1/teachers/{id}/analytics
│
├── 05 🧑‍🏫 Mentors
│   ├── GET    /api/v1/mentors
│   ├── GET    /api/v1/mentors/{id}
│   ├── POST   /api/v1/mentors
│   ├── PUT    /api/v1/mentors/{id}
│   ├── DELETE /api/v1/mentors/{id}
│   ├── GET    /api/v1/mentors/{id}/students
│   ├── GET    /api/v1/mentors/{id}/sessions
│   └── GET    /api/v1/mentors/{id}/analytics
│
├── 06 📚 Curriculum
│   ├── GET    /api/v1/curricula
│   ├── GET    /api/v1/curricula/{id}
│   ├── POST   /api/v1/curricula
│   ├── PUT    /api/v1/curricula/{id}
│   ├── PATCH  /api/v1/curricula/{id}/status
│   ├── DELETE /api/v1/curricula/{id}
│   ├── POST   /api/v1/curricula/{id}/publish
│   ├── POST   /api/v1/curricula/{id}/archive
│   ├── GET    /api/v1/curricula/{id}/subjects
│   ├── GET    /api/v1/curricula/{id}/competencies
│   ├── GET    /api/v1/curricula/{id}/learning-outcomes
│   ├── GET    /api/v1/curricula/{id}/learning-objectives
│   ├── GET    /api/v1/curricula/{id}/courses
│   └── GET    /api/v1/curricula/{id}/analytics
│
├── 07 🏫 Education Levels
│   ├── GET    /api/v1/education-levels
│   ├── GET    /api/v1/education-levels/{id}
│   ├── POST   /api/v1/education-levels
│   ├── PUT    /api/v1/education-levels/{id}
│   └── DELETE /api/v1/education-levels/{id}
│
├── 08 🎓 Grade Levels
│   ├── GET    /api/v1/grade-levels
│   ├── GET    /api/v1/grade-levels/{id}
│   ├── POST   /api/v1/grade-levels
│   ├── PUT    /api/v1/grade-levels/{id}
│   └── DELETE /api/v1/grade-levels/{id}
│
├── 09 📖 Phases
│   ├── GET    /api/v1/phases
│   ├── GET    /api/v1/phases/{id}
│   ├── POST   /api/v1/phases
│   ├── PUT    /api/v1/phases/{id}
│   └── DELETE /api/v1/phases/{id}
│
├── 10 📘 Subjects
│   ├── GET    /api/v1/subjects
│   ├── GET    /api/v1/subjects/{id}
│   ├── POST   /api/v1/subjects
│   ├── PUT    /api/v1/subjects/{id}
│   ├── DELETE /api/v1/subjects/{id}
│   └── GET    /api/v1/subjects/{id}/courses
│
├── 11 🎯 Competencies
│   ├── GET    /api/v1/competencies
│   ├── GET    /api/v1/competencies/{id}
│   ├── POST   /api/v1/competencies
│   ├── PUT    /api/v1/competencies/{id}
│   └── DELETE /api/v1/competencies/{id}
│
├── 12 📈 Learning Outcomes
│   ├── GET    /api/v1/learning-outcomes
│   ├── GET    /api/v1/learning-outcomes/{id}
│   ├── POST   /api/v1/learning-outcomes
│   ├── PUT    /api/v1/learning-outcomes/{id}
│   └── DELETE /api/v1/learning-outcomes/{id}
│
├── 13 🎯 Learning Objectives
│   ├── GET    /api/v1/learning-objectives
│   ├── GET    /api/v1/learning-objectives/{id}
│   ├── POST   /api/v1/learning-objectives
│   ├── PUT    /api/v1/learning-objectives/{id}
│   └── DELETE /api/v1/learning-objectives/{id}
│
├── 14 🌍 Curriculum Programs
│   ├── GET    /api/v1/curriculum-programs
│   ├── GET    /api/v1/curriculum-programs/{id}
│   ├── POST   /api/v1/curriculum-programs
│   ├── PUT    /api/v1/curriculum-programs/{id}
│   └── DELETE /api/v1/curriculum-programs/{id}
│
├── 15 📂 Categories
│   ├── GET    /api/v1/categories
│   ├── GET    /api/v1/categories/{id}
│   ├── POST   /api/v1/categories
│   ├── PUT    /api/v1/categories/{id}
│   ├── DELETE /api/v1/categories/{id}
│   └── GET    /api/v1/categories/{id}/courses
│
├── 16 📚 Courses
│   ├── GET    /api/v1/courses
│   ├── GET    /api/v1/courses/{id}
│   ├── POST   /api/v1/courses
│   ├── PUT    /api/v1/courses/{id}
│   ├── PATCH  /api/v1/courses/{id}/status
│   ├── DELETE /api/v1/courses/{id}
│   ├── POST   /api/v1/courses/{id}/publish
│   ├── POST   /api/v1/courses/{id}/unpublish
│   ├── GET    /api/v1/courses/{id}/students
│   ├── GET    /api/v1/courses/{id}/teachers
│   ├── GET    /api/v1/courses/{id}/progress
│   ├── GET    /api/v1/courses/{id}/reviews
│   ├── GET    /api/v1/courses/{id}/analytics
│   └── GET    /api/v1/courses/{id}/curriculum
│
├── 17 🧩 Course Sections
│   ├── GET    /api/v1/courses/{courseId}/sections
│   ├── POST   /api/v1/courses/{courseId}/sections
│   ├── GET    /api/v1/sections/{id}
│   ├── PUT    /api/v1/sections/{id}
│   ├── DELETE /api/v1/sections/{id}
│   └── PATCH  /api/v1/sections/{id}/order
│
├── 18 📑 Lessons
│   ├── GET    /api/v1/courses/{courseId}/lessons
│   ├── GET    /api/v1/lessons/{id}
│   ├── POST   /api/v1/lessons
│   ├── PUT    /api/v1/lessons/{id}
│   ├── DELETE /api/v1/lessons/{id}
│   └── PATCH  /api/v1/lessons/{id}/order
│
├── 19 📄 Materials
│   ├── GET    /api/v1/materials
│   ├── GET    /api/v1/materials/{id}
│   ├── POST   /api/v1/materials
│   ├── PUT    /api/v1/materials/{id}
│   ├── DELETE /api/v1/materials/{id}
│   └── GET    /api/v1/lessons/{lessonId}/materials
│
├── 20 🎥 Videos
│   ├── GET    /api/v1/videos
│   ├── GET    /api/v1/videos/{id}
│   ├── POST   /api/v1/videos
│   ├── PUT    /api/v1/videos/{id}
│   ├── DELETE /api/v1/videos/{id}
│   ├── POST   /api/v1/videos/{id}/process
│   ├── GET    /api/v1/videos/{id}/stream
│   └── GET    /api/v1/videos/{id}/progress
│
├── 21 📁 Files / Media
│   ├── POST   /api/v1/files/upload
│   ├── POST   /api/v1/files/presigned-url
│   ├── GET    /api/v1/files/{id}
│   ├── GET    /api/v1/files/{id}/download
│   └── DELETE /api/v1/files/{id}
│
├── 22 📝 Quizzes
│   ├── GET    /api/v1/quizzes
│   ├── GET    /api/v1/quizzes/{id}
│   ├── POST   /api/v1/quizzes
│   ├── PUT    /api/v1/quizzes/{id}
│   ├── DELETE /api/v1/quizzes/{id}
│   ├── POST   /api/v1/quizzes/{id}/publish
│   ├── POST   /api/v1/quizzes/{id}/start
│   ├── POST   /api/v1/quizzes/{id}/submit
│   └── GET    /api/v1/quizzes/{id}/results
│
├── 23 ❓ Questions
│   ├── GET    /api/v1/quizzes/{quizId}/questions
│   ├── GET    /api/v1/questions/{id}
│   ├── POST   /api/v1/quizzes/{quizId}/questions
│   ├── PUT    /api/v1/questions/{id}
│   ├── DELETE /api/v1/questions/{id}
│   └── PATCH  /api/v1/questions/{id}/order
│
├── 24 📋 Assignments
│   ├── GET    /api/v1/assignments
│   ├── GET    /api/v1/assignments/{id}
│   ├── POST   /api/v1/assignments
│   ├── PUT    /api/v1/assignments/{id}
│   ├── DELETE /api/v1/assignments/{id}
│   ├── POST   /api/v1/assignments/{id}/submit
│   ├── GET    /api/v1/assignments/{id}/submissions
│   └── POST   /api/v1/submissions/{id}/grade
│
├── 25 🎓 Enrollments
│   ├── GET    /api/v1/enrollments
│   ├── GET    /api/v1/enrollments/{id}
│   ├── POST   /api/v1/enrollments
│   ├── PATCH  /api/v1/enrollments/{id}/status
│   ├── DELETE /api/v1/enrollments/{id}
│   ├── GET    /api/v1/students/{studentId}/enrollments
│   └── GET    /api/v1/courses/{courseId}/enrollments
│
├── 26 📊 Progress
│   ├── GET    /api/v1/progress
│   ├── GET    /api/v1/progress/{id}
│   ├── POST   /api/v1/progress
│   ├── PUT    /api/v1/progress/{id}
│   ├── POST   /api/v1/progress/lessons/{lessonId}/complete
│   ├── POST   /api/v1/progress/videos/{videoId}/watch
│   └── GET    /api/v1/students/{studentId}/progress
│
├── 27 🏆 Certificates
│   ├── GET    /api/v1/certificates
│   ├── GET    /api/v1/certificates/{id}
│   ├── POST   /api/v1/certificates
│   ├── GET    /api/v1/certificates/{id}/download
│   ├── GET    /api/v1/certificates/verify/{code}
│   └── DELETE /api/v1/certificates/{id}
│
├── 28 ⭐ Reviews & Ratings
│   ├── GET    /api/v1/reviews
│   ├── GET    /api/v1/reviews/{id}
│   ├── POST   /api/v1/courses/{courseId}/reviews
│   ├── PUT    /api/v1/reviews/{id}
│   ├── DELETE /api/v1/reviews/{id}
│   └── GET    /api/v1/courses/{courseId}/rating
│
├── 29 ❤️ Wishlist
│   ├── GET    /api/v1/wishlist
│   ├── POST   /api/v1/wishlist/courses/{courseId}
│   ├── DELETE /api/v1/wishlist/courses/{courseId}
│   └── GET    /api/v1/students/{studentId}/wishlist
│
├── 30 💬 Discussions
│   ├── GET    /api/v1/discussions
│   ├── GET    /api/v1/discussions/{id}
│   ├── POST   /api/v1/discussions
│   ├── PUT    /api/v1/discussions/{id}
│   ├── DELETE /api/v1/discussions/{id}
│   ├── GET    /api/v1/discussions/{id}/comments
│   └── POST   /api/v1/discussions/{id}/comments
│
├── 31 💭 Comments
│   ├── PUT    /api/v1/comments/{id}
│   └── DELETE /api/v1/comments/{id}
│
├── 32 🧑‍💻 Live Classes
│   ├── GET    /api/v1/live-classes
│   ├── GET    /api/v1/live-classes/{id}
│   ├── POST   /api/v1/live-classes
│   ├── PUT    /api/v1/live-classes/{id}
│   ├── DELETE /api/v1/live-classes/{id}
│   ├── POST   /api/v1/live-classes/{id}/start
│   ├── POST   /api/v1/live-classes/{id}/end
│   └── GET    /api/v1/live-classes/{id}/participants
│
├── 33 📅 Schedules
│   ├── GET    /api/v1/schedules
│   ├── GET    /api/v1/schedules/{id}
│   ├── POST   /api/v1/schedules
│   ├── PUT    /api/v1/schedules/{id}
│   └── DELETE /api/v1/schedules/{id}
│
├── 34 📝 Attendance
│   ├── GET    /api/v1/attendance
│   ├── POST   /api/v1/attendance/check-in
│   ├── POST   /api/v1/attendance/check-out
│   ├── PUT    /api/v1/attendance/{id}
│   └── GET    /api/v1/courses/{courseId}/attendance
│
├── 35 💳 Payments
│   ├── GET    /api/v1/payments
│   ├── GET    /api/v1/payments/{id}
│   ├── POST   /api/v1/payments
│   ├── POST   /api/v1/payments/{id}/cancel
│   ├── POST   /api/v1/payments/{id}/refund
│   └── GET    /api/v1/students/{studentId}/payments
│
├── 36 💰 Transactions
│   ├── GET    /api/v1/transactions
│   ├── GET    /api/v1/transactions/{id}
│   └── GET    /api/v1/transactions/{id}/invoice
│
├── 37 📦 Packages
│   ├── GET    /api/v1/packages
│   ├── GET    /api/v1/packages/{id}
│   ├── POST   /api/v1/packages
│   ├── PUT    /api/v1/packages/{id}
│   └── DELETE /api/v1/packages/{id}
│
├── 38 🎟️ Coupons
│   ├── GET    /api/v1/coupons
│   ├── GET    /api/v1/coupons/{id}
│   ├── POST   /api/v1/coupons
│   ├── PUT    /api/v1/coupons/{id}
│   ├── DELETE /api/v1/coupons/{id}
│   └── POST   /api/v1/coupons/validate
│
├── 39 🔔 Notifications
│   ├── GET    /api/v1/notifications
│   ├── GET    /api/v1/notifications/{id}
│   ├── PATCH  /api/v1/notifications/{id}/read
│   ├── PATCH  /api/v1/notifications/read-all
│   └── DELETE /api/v1/notifications/{id}
│
├── 40 📧 Messages
│   ├── GET    /api/v1/messages
│   ├── GET    /api/v1/messages/{id}
│   ├── POST   /api/v1/messages
│   ├── PATCH  /api/v1/messages/{id}/read
│   └── DELETE /api/v1/messages/{id}
│
├── 41 🔎 Search
│   ├── GET    /api/v1/search
│   ├── GET    /api/v1/search/courses
│   ├── GET    /api/v1/search/teachers
│   ├── GET    /api/v1/search/materials
│   └── GET    /api/v1/search/students
│
├── 42 📈 Reports
│   ├── GET    /api/v1/reports/dashboard
│   ├── GET    /api/v1/reports/students
│   ├── GET    /api/v1/reports/teachers
│   ├── GET    /api/v1/reports/courses
│   ├── GET    /api/v1/reports/enrollments
│   ├── GET    /api/v1/reports/progress
│   ├── GET    /api/v1/reports/revenue
│   ├── GET    /api/v1/reports/attendance
│   └── GET    /api/v1/reports/export
│
├── 43 📊 Analytics
│   ├── GET    /api/v1/analytics/overview
│   ├── GET    /api/v1/analytics/students
│   ├── GET    /api/v1/analytics/teachers
│   ├── GET    /api/v1/analytics/courses
│   ├── GET    /api/v1/analytics/engagement
│   └── GET    /api/v1/analytics/revenue
│
├── 44 🤖 AI Recommendation
│   ├── GET    /api/v1/ai/recommendations
│   ├── GET    /api/v1/ai/recommendations/courses
│   ├── GET    /api/v1/ai/recommendations/learning-path
│   └── POST   /api/v1/ai/recommendations/refresh
│
├── 45 🤖 AI Learning Assistant
│   ├── POST   /api/v1/ai/assistant/chat
│   ├── GET    /api/v1/ai/assistant/conversations
│   ├── GET    /api/v1/ai/assistant/conversations/{id}
│   └── DELETE /api/v1/ai/assistant/conversations/{id}
│
├── 46 🧠 AI Quiz
│   ├── POST   /api/v1/ai/quiz/generate
│   ├── POST   /api/v1/ai/quiz/explain
│   └── POST   /api/v1/ai/quiz/recommend
│
├── 47 🧠 AI Skill Analysis
│   ├── GET    /api/v1/ai/skills/profile
│   ├── POST   /api/v1/ai/skills/analyze
│   ├── GET    /api/v1/ai/skills/gaps
│   └── GET    /api/v1/ai/skills/recommendations
│
├── 48 🗺️ Learning Paths
│   ├── GET    /api/v1/learning-paths
│   ├── GET    /api/v1/learning-paths/{id}
│   ├── POST   /api/v1/learning-paths
│   ├── PUT    /api/v1/learning-paths/{id}
│   ├── DELETE /api/v1/learning-paths/{id}
│   └── GET    /api/v1/learning-paths/{id}/courses
│
├── 49 🏅 Skills
│   ├── GET    /api/v1/skills
│   ├── GET    /api/v1/skills/{id}
│   ├── POST   /api/v1/skills
│   ├── PUT    /api/v1/skills/{id}
│   ├── DELETE /api/v1/skills/{id}
│   └── GET    /api/v1/students/{studentId}/skills
│
├── 50 🔐 Roles
│   ├── GET    /api/v1/roles
│   ├── GET    /api/v1/roles/{id}
│   ├── POST   /api/v1/roles
│   ├── PUT    /api/v1/roles/{id}
│   └── DELETE /api/v1/roles/{id}
│
├── 51 🔑 Permissions
│   ├── GET    /api/v1/permissions
│   ├── GET    /api/v1/permissions/{id}
│   ├── POST   /api/v1/permissions
│   ├── PUT    /api/v1/permissions/{id}
│   └── DELETE /api/v1/permissions/{id}
│
├── 52 🛡️ Role Permissions
│   ├── GET    /api/v1/roles/{roleId}/permissions
│   ├── POST   /api/v1/roles/{roleId}/permissions
│   └── DELETE /api/v1/roles/{roleId}/permissions/{permissionId}
│
├── 53 🧾 Audit Logs
│   ├── GET    /api/v1/audit-logs
│   ├── GET    /api/v1/audit-logs/{id}
│   └── GET    /api/v1/users/{userId}/audit-logs
│
├── 54 ⚙️ Settings
│   ├── GET    /api/v1/settings
│   ├── GET    /api/v1/settings/{key}
│   ├── PUT    /api/v1/settings/{key}
│   └── PATCH  /api/v1/settings/{key}
│
├── 55 🏢 Organizations
│   ├── GET    /api/v1/organizations
│   ├── GET    /api/v1/organizations/{id}
│   ├── POST   /api/v1/organizations
│   ├── PUT    /api/v1/organizations/{id}
│   └── DELETE /api/v1/organizations/{id}
│
├── 56 🏫 Institutions
│   ├── GET    /api/v1/institutions
│   ├── GET    /api/v1/institutions/{id}
│   ├── POST   /api/v1/institutions
│   ├── PUT    /api/v1/institutions/{id}
│   └── DELETE /api/v1/institutions/{id}
│
├── 57 🌐 Public API
│   ├── GET    /api/v1/public/courses
│   ├── GET    /api/v1/public/courses/{id}
│   ├── GET    /api/v1/public/categories
│   ├── GET    /api/v1/public/teachers
│   └── GET    /api/v1/public/config
│
└── 58 ⚙️ System
    ├── GET    /api/v1/health
    ├── GET    /api/v1/version
    ├── GET    /actuator/health
    ├── GET    /actuator/info
    └── GET    /actuator/metrics

#STRUCTURE BACKEND
backend/src/main/java/com/skillguru/

├── config/
├── security/
│
├── controller/
│   ├── auth/
│   ├── user/
│   ├── student/
│   ├── teacher/
│   ├── mentor/
│   ├── curriculum/
│   ├── academic/
│   ├── course/
│   ├── lesson/
│   ├── material/
│   ├── video/
│   ├── quiz/
│   ├── assignment/
│   ├── enrollment/
│   ├── progress/
│   ├── certificate/
│   ├── discussion/
│   ├── liveclass/
│   ├── payment/
│   ├── notification/
│   ├── report/
│   ├── analytics/
│   ├── ai/
│   ├── learningpath/
│   ├── skill/
│   ├── admin/
│   └── system/
│
├── service/
├── repository/
├── entity/
├── dto/
├── mapper/
├── exception/
└── common/


OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
