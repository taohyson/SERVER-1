#! /usr/bin/python
# -*- coding: utf-8 -*-

'''
    用于编译proto文件，使用: pb_builder.py [all]
    1，pb_builder.py all    全编
    2，pb_builder.py        编译有更新的Proto
'''
import os,sys

__author__ = 'wu_hc'

def get_modify_proto_files(proto_file_path):
    file_list = os.popen('svn st %s' % proto_file_path).readlines()
    L=[]
    for f in file_list:
        if (f.startswith('M') or f.startswith('A')) and  f.endswith('.proto\n'):
            pb_file_name = f.replace('\n','').replace(' ',"")[1:]
            L.append(os.path.join(proto_file_path,pb_file_name))
    return L


def get_all_proto_files(proto_file_path):
    L=[]
    for root, dirs, files in os.walk(proto_file_path):
        for file in files:
            if os.path.splitext(file)[1] == '.proto':
                L.append(os.path.join(root, file))
    return L


if __name__ == "__main__":
    #local var
    input_args = sys.argv[1:]
    cur_path = os.getcwd()
    out_path = os.path.join(cur_path,'src','main','java')
    proto_file_path = os.path.join(cur_path,'proto')

    compile_proto_files = (len(input_args) >= 1 and input_args[0] == 'all') and get_all_proto_files(proto_file_path) or get_modify_proto_files(proto_file_path)
    if len(compile_proto_files) == 0:
        print("No proto file modify,If u want to compile all proto file,run: python pb_builder.py all")
    else:
        for f in compile_proto_files:
            cmd = 'protoc -I=%s --java_out=%s %s' % (proto_file_path,out_path,f);
            os.system(cmd)
            print(cmd)
        print ("Generate Finish!!!")