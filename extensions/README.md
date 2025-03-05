Extensions for Morimanga apps/server

---
How to use example:
```kotlin
// Parser instance
val parser = ExtensionBase.newExtensionInstance(Extensions.MANGALIB)

// Return title info
parser.getTitleInfo("kimetsu-no-yaiba")

// Returns extension info
parser.extensionInfo()
```