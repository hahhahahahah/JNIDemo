/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_org_zl_testjni_JNI_MyJNI */

#ifndef _Included_com_org_zl_testjni_JNI_MyJNI
#define _Included_com_org_zl_testjni_JNI_MyJNI
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_org_zl_testjni_JNI_MyJNI
 * Method:    add
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_com_org_zl_testjni_JNI_MyJNI_add
  (JNIEnv *en, jclass obj, jint i, jint j){
        return i+j;
}


/*
 * Class:     com_org_zl_testjni_JNI_MyJNI
 * Method:    subtract
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_com_org_zl_testjni_JNI_MyJNI_subtract
  (JNIEnv *en, jclass obj, jint i, jint j) {
    return i-j;
}

/*
 * Class:     com_org_zl_testjni_JNI_MyJNI
 * Method:    multiply
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_com_org_zl_testjni_JNI_MyJNI_multiply
(JNIEnv *en, jclass obj, jint i, jint j){
    return i*j;

}
/*
 * Class:     com_org_zl_testjni_JNI_MyJNI
 * Method:    divide
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_com_org_zl_testjni_JNI_MyJNI_divide
(JNIEnv *en, jclass obj, jint i, jint j){
    return i/j;
}

#ifdef __cplusplus
}
#endif
#endif
