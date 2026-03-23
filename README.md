<p align="center">
  <img src="./images/icon.png" alt="AndroidIDE" width="80" height="80"/>
</p>

<h2 align="center"><b>AndroidIDE</b></h2>

<p align="center">
  <a href="#readme-en">English</a> • <a href="#readme-zh">简体中文</a>
</p>

---

<a name="readme-en"></a>

<p align="center">
  An IDE to develop real, Gradle-based Android applications on Android devices.
<p><br>

<p align="center">
<img src="https://img.shields.io/github/v/release/GT2N/AndroidIDE-Fix?include_prereleases&amp;label=latest%20release" alt="Latest release">
<img src="https://github.com/GT2N/AndroidIDE-Fix/actions/workflows/build.yml/badge.svg" alt="Builds and tests">
<img src="https://www.codefactor.io/repository/github/GT2N/AndroidIDE-Fix/badge/main" alt="CodeFactor">
<a href="https://crowdin.com/project/androidide"><img src="https://badges.crowdin.net/androidide/localized.svg" alt="Crowdin"></a>
<img src="https://img.shields.io/badge/License-GPLv3-blue.svg" alt="License"></p>

<p align="center">
  <a href="https://docs.androidide.com/">Explore the docs »</a> &nbsp; &nbsp;
</p>

<p align="center">
  <a href="https://github.com/GT2N/AndroidIDE-Fix/issues/new?labels=bug&template=BUG.yml&title=%5BBug%5D%3A+">Report a bug</a> &nbsp; &#8226; &nbsp;
  <a href="https://github.com/GT2N/AndroidIDE-Fix/issues/new?labels=feature&template=FEATURE.yml&title=%5BFeature%5D%3A+">Request a feature</a> &nbsp; &#8226; &nbsp;
  <a href="https://t.me/androidide_discussions">Join us on Telegram</a>
</p>

> [!WARNING]
>
> THIS PROJECT IS NOT MAINTAINED ANYMORE BY THE ORIGINAL AUTHOR.
> 
> **Update:** This version **fixes the broken software sources** (repositories), resolving the issue where build tools and dependencies could not be downloaded.

## Features

- [x] Gradle support.
- [x] `JDK 11` and `JDK 17` available for use.
- [x] Terminal with necessary packages.
- [x] Custom environment variables (for Build & Terminal).
- [x] SDK Manager (Available via terminal).
- [x] API information for classes and their members (since, removed, deprecated).
- [x] Log reader (shows your app's logs in real-time)
- [ ] Language servers
    - [x] Java
    - [x] XML
    - [ ] Kotlin
- [ ] UI Designer
    - [x] Layout inflater
    - [x] Resolve resource references
    - [x] Auto-complete resource values when user edits attributes using the attribute editor
    - [x] Drag & Drop
    - [x] Visual attribute editor
    - [x] Android Widgets
- [ ] String Translator
- [ ] Asset Studio (Drawable & Icon Maker)
- [x] Git

## Installation

[<img src="https://github.com/Kunzisoft/Github-badge/raw/main/get-it-on-github.svg"
    alt="Get it on GitHub"
    height="80">](https://github.com/GT2N/AndroidIDE-Fix/releases)

> _Please install AndroidIDE from this official fork only:_
> - [_GitHub Releases (Fixed Version)_](https://github.com/GT2N/AndroidIDE-Fix/releases)

- Download the AndroidIDE APK from the GitHub releases above.
- Follow the instructions [here](https://docs.androidide.com/tutorials/get-started.html) to install the build tools.

## Limitations

- For working with projects in AndroidIDE, your project must use Android Gradle Plugin v7.2.0 or newer. Projects with older AGP must be migrated to newer versions.
- SDK Manager is already included in Android SDK and is accessible via Terminal. Some tools (like NDK) cannot be installed as they are not built for Android.
- No official NDK support because we haven't built the NDK for Android.

## Contributing

See the [contributing guide](./CONTRIBUTING.md).
For translations, visit the [Crowdin project page](https://crowdin.com/project/androidide).

## Thanks to

- [Rosemoe](https://github.com/Rosemoe) for the awesome [CodeEditor](https://github.com/Rosemoe/sora-editor)
- [Termux](https://github.com/termux) for [Terminal Emulator](https://github.com/termux/termux-app)
- [Bogdan Melnychuk](https://github.com/bmelnychuk) for [AndroidTreeView](https://github.com/bmelnychuk/AndroidTreeView)
- [George Fraser](https://github.com/georgewfraser) for the [Java Language Server](https://github.com/georgewfraser/java-language-server)

Thanks to all the developers who have contributed to this project.

<p>This project is supported by:</p>
<p>
  <a href="https://m.do.co/c/54add371d1d7">
    <img src="https://opensource.nyc3.cdn.digitaloceanspaces.com/attribution/assets/SVG/DO_Logo_horizontal_blue.svg" width="201px">
  </a>
</p>

## Contact Us

- [Website](https://m.androidide.com)
- [Telegram](https://t.me/androidide_discussions)

## License
AndroidIDE is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

AndroidIDE is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with AndroidIDE.  If not, see https://www.gnu.org/licenses/.


Any violations to the license can be reported either by opening an issue or writing a mail to us directly.

---

<a name="readme-zh"></a>

<h2 align="center"><b>简体中文 (Simplified Chinese)</b></h2>

<p align="center">
  一个直接在 Android 设备上开发真实的、基于 Gradle 的 Android 应用程序的 IDE。
<p><br>

<p align="center">
<img src="https://img.shields.io/github/v/release/GT2N/AndroidIDE-Fix?include_prereleases&amp;label=最新版本" alt="Latest release">
<img src="https://github.com/GT2N/AndroidIDE-Fix/actions/workflows/build.yml/badge.svg" alt="Builds and tests">
<img src="https://www.codefactor.io/repository/github/GT2N/AndroidIDE-Fix/badge/main" alt="CodeFactor">
<a href="https://crowdin.com/project/androidide"><img src="https://badges.crowdin.net/androidide/localized.svg" alt="Crowdin"></a>
<img src="https://img.shields.io/badge/许可证-GPLv3-blue.svg" alt="License"></p>

<p align="center">
  <a href="https://docs.androidide.com/">查看文档 »</a> &nbsp; &nbsp;
</p>

<p align="center">
  <a href="https://github.com/GT2N/AndroidIDE-Fix/issues/new?labels=bug&template=BUG.yml&title=%5BBug%5D%3A+">反馈 Bug</a> &nbsp; &#8226; &nbsp;
  <a href="https://github.com/GT2N/AndroidIDE-Fix/issues/new?labels=feature&template=FEATURE.yml&title=%5BFeature%5D%3A+">提交功能请求</a> &nbsp; &#8226; &nbsp;
  <a href="https://t.me/androidide_discussions">加入 Telegram 群组</a>
</p>

> [!WARNING]
>
> **原作者已停止维护本项目。**
> 
> **重要更新：** 本版本**修复了已损坏的软件源**，解决了原版无法下载构建工具和依赖库的问题。

## 功能特性

- [x] 支持 Gradle 构建。
- [x] 提供 `JDK 11` 和 `JDK 17` 供使用。
- [x] 包含必要软件包的终端。
- [x] 自定义环境变量（用于构建和终端）。
- [x] SDK 管理器（通过终端调用）。
- [x] 类及其成员的 API 信息（新增、移除、弃用状态）。
- [x] 日志阅读器（实时显示应用程序日志）。
- [ ] 语言服务器 (LSP)
    - [x] Java
    - [x] XML
    - [ ] Kotlin
- [ ] UI 设计器
    - [x] 布局填充器 (Layout inflater)
    - [x] 解析资源引用
    - [x] 属性编辑器自动补全
    - [x] 拖拽操作
    - [x] 可视化属性编辑器
    - [x] Android 常用控件
- [ ] 字符串翻译器
- [ ] 资源工作室 (Drawable & 图标制作)
- [x] Git 支持

## 安装指南

[<img src="https://github.com/Kunzisoft/Github-badge/raw/main/get-it-on-github.svg"
    alt="GitHub"
    height="80">](https://github.com/GT2N/AndroidIDE-Fix/releases)

> _请务必从以下受信任的修复版渠道安装：_
> - [_GitHub Releases (修复版本)_](https://github.com/GT2N/AndroidIDE-Fix/releases)

- 从上述 GitHub 链接下载 AndroidIDE APK。
- 按照 [此处教程](https://docs.androidide.com/tutorials/get-started.html) 安装构建工具。

## 使用限制

- 你的项目必须使用 **Android Gradle Plugin (AGP) v7.2.0** 或更高版本。
- SDK 管理器已包含在 SDK 中，可在终端访问。但部分工具（如 NDK）无法安装，因为它们并非为 Android 原生系统构建。
- **暂不支持官方 NDK**，因为我们尚未在 Android 上构建 NDK。

## 贡献

请参阅 [贡献指南](./CONTRIBUTING.md)。
翻译工作请访问 [Crowdin 项目页面](https://crowdin.com/project/androidide)。

## 致谢

- [Rosemoe](https://github.com/Rosemoe) 提供的 [CodeEditor](https://github.com/Rosemoe/sora-editor)
- [Termux](https://github.com/termux) 提供的 [终端模拟器](https://github.com/termux/termux-app)
- [Bogdan Melnychuk](https://github.com/bmelnychuk) 提供的 [AndroidTreeView](https://github.com/bmelnychuk/AndroidTreeView)
- [George Fraser](https://github.com/georgewfraser) 提供的 [Java Language Server](https://github.com/georgewfraser/java-language-server)

感谢所有为本项目做出贡献的开发者。

<p>本项目由以下机构支持：</p>
<p>
  <a href="https://m.do.co/c/54add371d1d7">
    <img src="https://opensource.nyc3.cdn.digitaloceanspaces.com/attribution/assets/SVG/DO_Logo_horizontal_blue.svg" width="201px">
  </a>
</p>

## 联系我们

- [官网](https://m.androidide.com)
- [Telegram](https://t.me/androidide_discussions)

## 许可证 (License)

AndroidIDE is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

AndroidIDE is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with AndroidIDE.  If not, see https://www.gnu.org/licenses/.


任何违反许可证的行为都可以通过开启 Issue 或直接向我们发送邮件来报告。
