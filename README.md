# ☕ 실전 자바 - 중급 1편 (Java Intermediate Vol.1)

> 인프런 김영한 강사님의 **[실전 자바 - 중급 1편]**을 수강하며 자바의 핵심 원리와 내부 동작 방식을 깊이 있게 탐구한 리포지토리입니다.

## 🎯 학습 목표
* 프레임워크(Spring) 사용 전, 자바 언어 자체에 대한 깊은 이해 도모
* 객체 지향적인 설계와 메모리 효율성을 고려한 코드 작성 능력 배양
* 자바 표준 라이브러리의 내부 구조 파악 및 올바른 활용법 습득

## 📝 Key Learnings (핵심 학습 내용)

### 🔹 객체 지향과 메모리 구조
* **Object & 불변성**: 모든 객체의 조상인 `Object`의 메서드를 올바르게 오버라이딩하는 법을 익히고, 멀티스레드 환경이나 공유 참조 상황에서 사이드 이펙트를 원천 차단하는 **불변 객체(Immutable Object)** 설계의 중요성을 체득함.
* **중첩 클래스**: 클래스 간의 논리적 그룹화와 캡슐화를 위해 정적 중첩 클래스와 내부 클래스를 구분하여 사용하는 기준을 확립함.

### 🔹 타입 안전성과 데이터 처리
* **Enum (열거형)**: 단순 상수를 넘어, 상태와 행위를 함께 관리하는 객체로서의 `Enum` 패턴을 학습하여 **타입 안전성(Type Safety)**이 보장된 코드를 작성함.
* **String & Date**: 자바의 문자열 풀(String Pool) 최적화 원리를 이해하고, 불변성을 유지하며 날짜와 시간을 다루는 모던 자바(Java 8+)의 `LocalDateTime` API 활용법을 익힘.

### 🔹 견고한 애플리케이션 설계
* **예외 처리**: 예외 계층 구조를 이해하고, 비즈니스 로직을 오염시키지 않으면서 실무적으로 유용한 **언체크(Runtime) 예외** 처리 전략과 트랜잭션 롤백에 대한 개념을 정립함.

## 🛠️ Tech Stack
![Java 21](https://img.shields.io/badge/Java%2021-ED8B00?style=flat-square&logo=openjdk&logoColor=white) ![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ%20IDEA-000000?style=flat-square&logo=intellij-idea&logoColor=white)

## 📂 Directory Structure
```bash
src
├── lang
│   ├── object      # Object 클래스, equals, hashCode
│   ├── immutable   # 불변 객체 설계
│   ├── string      # String 최적화, StringBuilder
│   └── wrapper     # 래퍼 클래스와 오토 박싱/언박싱
├── enumeration     # Enum 패턴과 리팩토링
├── time            # 날짜와 시간 API
├── nested          # 중첩, 내부, 익명 클래스
└── exception       # 체크/언체크 예외 처리
