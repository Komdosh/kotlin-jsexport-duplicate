Run `gradle assemble` 

Open `build/js/packages/kotlin-jsexport-duplicate-module1/kotlin/kotlin-jsexport-duplicate-module1.d.ts`.

Find `abstract class SerializableEnumClass` and `abstract class AbstractSerializableClass`

You will see 

```typescript
abstract class SerializableEnumClass {
    private constructor();
    static get VALUE(): com.example.SerializableEnumClass & {
        get name(): "VALUE";
        get ordinal(): 0;
    };
    static get VALUE_2(): com.example.SerializableEnumClass & {
        get name(): "VALUE_2";
        get ordinal(): 1;
    };
    get name(): "VALUE" | "VALUE_2";
    get ordinal(): 0 | 1;
    static values(): Array<com.example.SerializableEnumClass>;
    static valueOf(value: string): com.example.SerializableEnumClass;
    static get Companion(): {
    } & any/* kotlinx.serialization.internal.SerializerFactory */;
}
```

and

```typescript
    abstract class AbstractSerializableClass {
    constructor(name: string);
    get name(): string;
    static get Companion(): {
    } & any/* kotlinx.serialization.internal.SerializerFactory */;
}
```

Traditional classes (and data classes) will have a separate namespace for `$serializer`

```typescript
class Module1Data2Class {
    constructor(name: string);
    get name(): string;
    copy(name?: string): com.example.Module1Data2Class;
    toString(): string;
    hashCode(): number;
    equals(other: Nullable<any>): boolean;
    static get Companion(): {
    };
}
namespace Module1Data2Class {
    /** @deprecated This synthesized declaration should not be used directly */
    interface $serializer {
        readonly __doNotUseOrImplementIt: {
            readonly "com.example.Module1Data2Class.$serializer": unique symbol;
        };
    }
}
```