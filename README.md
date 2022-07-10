# Design Pattern

## Objective
to know and utilize design patterns better  
to know what best(at least not worst) practice is

## What design pattern is

**Design pattern** is something that represents solution to problems which is common when developing software.  
That is to say, Typical solution for common problems arise during developing software.

## Benefits
- Knowing which trials-and-errors former developers had experienced
- Reusing successful and well-structured designs
- Utilizing expert knowledge embedded on design patterns
- Effective communication among developers
  - e.g.You could use the word _Adapter_ for better communication on your design
  
## Based on
the book: [`Design Patterns: Elements of Reusable Object-Oriented Software`](http://www.yes24.com/Product/Goods/200592)  
authored by: `Erich Gamma`, `John Vlissides`, `Ralph Johnson`, `Richard Helm`, well known as **GoF**  
and the website: [Refactoring Guru](https://refactoring.guru/design-patterns)

## ...
> If all you have is a hammer, everything looks like a nail.

Let's not try to apply it everywhere. There are some cases simpler code would do just fine.

## 헤드 퍼스트 디자인 패턴(2021)
- GoF 디자인 패턴
  - [x] [전략 패턴](src/strategypattern)
  - [ ] 옵저버 패턴
  - [ ] 데코레이터 패턴
  - [ ] 팩토리 패턴
  - [ ] 싱글턴 패턴
  - [ ] 커맨드 패턴
  - [ ] 어댑터 패턴
  - [ ] 퍼사드 패턴
  - [ ] 템플릿 메소드 패턴
  - [ ] 반복자 패턴
  - [ ] 컴포지트 패턴
  - [ ] 상태 패턴
  - [ ] 프록시 패턴
  - [ ] 복합 패턴(MVC)
- 디자인 원칙
  - [ ] 캡슐화 원칙
  - [x] [인터페이스 우선 원칙](src/strategypattern)
  - [x] [구성 우선 원칙](src/strategypattern)
  - [ ] 느슨한 결합 원칙
  - [x] [OCP](src/strategypattern)
  - [ ] 의존성 뒤집기 원칙
  - [ ] 최소 지식 원칙
  - [ ] 할리우드 원칙
  - [ ] 단일 역할 원칙


## List to cover
- Creational Patterns
  - [x] [Factory Method](src/creational/factorymethod)
  - [x] [Abstract Factory](src/creational/abstractfactory)
  - [x] [Builder](src/creational/builder)
  - [ ] Prototype
  - [ ] [Singleton](src/creational/singleton)
- Structural Patterns
  - [ ] Adapter
  - [ ] Bridge
  - [ ] Composite
  - [ ] Decorator
  - [ ] Facade
  - [ ] Flyweight
  - [ ] Proxy
- Behavioral Patterns
  - [ ] Chain of Responsibility
  - [ ] Command
  - [ ] Interpreter
  - [ ] Iterator
  - [ ] Mediator
  - [ ] Memento
  - [ ] Observer
  - [ ] State
  - [ ] Strategy
  - [ ] Template Method
  - [ ] Visitor

Contents can be varied, simplified or omitted.  
다루는 내용이 달라질 수 있고, 일부는 간략화되거나 생략될 수 있음.