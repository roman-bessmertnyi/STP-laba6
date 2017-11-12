# Laba 6

All words are saved into a tree made of letters.
Some nodes are marked as word endings.
Using this tree we can efficiently sort the words into three lists:
- simple
- partly concatenated
- fully concatenated

Also it can get the biggest fully concatenated words.

The whole process is measured for time and memory usage.

> results:
> "C:\Program Files\Java\jdk1.8.0_144\bin\java" "-javaagent:D:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2017.2.3\lib\idea_rt.jar=65534:D:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2017.2.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_144\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\rt.jar;D:\KPI\STP\laba6\out\production\classes" laba6.Main
> 882.645671 millisec
> Memory used: 47369744 B 
> Simple words: 3156
> Partly concatenated words: 73265
> Fully concatenated words: 97107
> The longest concatenated word: [ethylenediaminetetraacetates] with length 28
> The 2nd longest concatenated word: [electroencephalographically, ethylenediaminetetraacetate]
>
> Process finished with exit code 0

[![Build Status](https://travis-ci.org/roman-bessmertnyi/laba6.svg?branch=master)](https://travis-ci.org/roman-bessmertnyi/laba6)
[![codecov](https://codecov.io/gh/roman-bessmertnyi/laba6/branch/master/graph/badge.svg)](https://codecov.io/gh/roman-bessmertnyi/laba6)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/930219b2288f4247ac5fd1c7d97f028e)](https://www.codacy.com/app/roman-bessmertnyi/laba6?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=roman-bessmertnyi/laba6&amp;utm_campaign=Badge_Grade)
[![Codacy Badge](https://api.codacy.com/project/badge/Coverage/930219b2288f4247ac5fd1c7d97f028e)](https://www.codacy.com/app/roman-bessmertnyi/laba6?utm_source=github.com&utm_medium=referral&utm_content=roman-bessmertnyi/laba6&utm_campaign=Badge_Coverage)
