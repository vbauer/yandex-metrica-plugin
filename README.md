
Jenkins Yandex Metrica Plugin
=============================

Yandex Metrica plugin allows to decorate all Jenkins pages with [Yandex.Metrica](https://metrica.yandex.com) tracking code.
It helps you get descriptive reports and record the actions of individual users, find out what they are searching
for on the build system, and how do they use it.


Requirements
------------

* Jenkins LTS 1.580.1 or higher
* Java SE Runtime Environment 1.7 or higher
* Yandex Metrica's account and counter


Installation
------------

This plugin is not yet available in the Jenkins plugin "hub". Until then, you can install the plugin easily by uploading the binary to Jenkins through Plugin Manager UI.

To do so:

* Build binary release. See "Development section" for additional information.
* Go to Manage Jenkins>-Manage Plugins.
* Switch to the "Advanced" tab.
* In the "Upload Plugin" section, pick the binary downloaded in the first step and press "Upload".


Configuration
-------------

Configuration section for this plugin is very simple:

![Configuration](misc/configuration.png)

You should specify only "Counter ID" parameter to integrate Jenkins with Yandex Metrica.


Development
-----------

How to build the `hpi` file:

1. Clone the git repository:
    ```sh
    $> git clone https://github.com/vbauer/yandex-metrica-plugin
    ```
    
2. Change directory to the `"yandex-metrica-plugin"` repository:
    ```sh
    $> cd yandex-metrica-plugin
    ```
    
3. Build the hpi file from source:
    ```sh
    $> mvn clean package
    ```

4. The hpi file is located at `"target/yandex-metrica.hpi"`.

5. If you would like to run a local Jenkins instance with the plug-in:
    ```sh
    $> mvn clean package hpi:run
    ```

Contributing guidelines
-----------------------

Feel free to file bugs or pull requests [here](https://github.com/vbauer/yandex-metrica-plugin).

**NB:** If you would like to send PR, check your build with `"strict"` profile (it runs PMD and Checkstyle Maven plugins):

```sh
$> mvn clean package -P strict
```


License
-------

Yandex Metrica plugin is licensed under the MIT license. See [LICENSE](LICENSE.md) file for more information.
