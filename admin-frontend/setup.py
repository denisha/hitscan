#!/usr/bin/env python
# -*- coding: utf-8 -*-
try:
    from setuptools import setup, find_packages
except ImportError:
    from distutils.core import setup

requirements = [
    'django',
    'pyrebase',
]

version = str(open('version').read()).strip()

setup_args = {
    'name': 'HitScan',
    'version': version,
    'description': "Admin frontend for HitScan",
    'author': "Serpens Team",
    'author_email': 'serpens@takealot.com',
    'url': 'https://github.com/denisha/hitscan',
    'install_requires': requirements,
    'keywords': 'payment_ipay_service',
    'classifiers': [
        'Development Status :: 2 - Pre-Alpha',
        'Intended Audience :: Takealot Developers',
        'Natural Language :: English',
        'Programming Language :: Python :: 2.7',
    ],
}

setup(**setup_args)
