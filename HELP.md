# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/4.0.3/gradle-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/4.0.3/gradle-plugin/packaging-oci-image.html)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

### 从rancher下载的配置文件，需要先base64编码，再解码
- 编码后存储在github : cat phiz-eks3-test.yaml | base64 -w 0 | pbcopy
- 流水线中使用时解码：echo "${{ secrets.RANCHER_KUBECONFIG }}" | base64 -d >  ~/.kube/config
  