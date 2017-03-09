#include <stdio.h>
#include <jni.h>
#include "Native_NativeHelloWorld.h"

JNIEXPORT void JNICALL Java_Native_NativeHelloWorld_sayHello(JNIEnv *env, jobject obj) {
  printf("Hello, World!\n");
  return;
}
